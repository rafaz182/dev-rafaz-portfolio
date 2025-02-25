package dev.rafaz.portfolio.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.rafaz.portfolio.R
import dev.rafaz.portfolio.ui.theme.PortfolioTheme
import dev.rafaz.portfolio.util.drawWithLayer

@Composable
fun HomeHeader(
    background: Color,
    height: Dp = 150.dp
) {
    val density = LocalDensity.current
    val statusBarHeight = with(density) { WindowInsets.statusBars.asPaddingValues().calculateTopPadding().toPx() }
    val heightPx = with(density) { height.toPx() } + statusBarHeight
    val margin = height.div(100).times(5)
    val shapeSize = with(density) { height.div(2).plus(margin).toPx() }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .drawWithLayer {
                val canvasQuadrantSize = size
                drawRect(
                    color = background,
                    size = Size(width = canvasQuadrantSize.width, height = heightPx)
                )

                // Source
                drawCircle(
                    center = Offset(x = canvasQuadrantSize.width / 2, y = heightPx),
                    radius = shapeSize,
                    blendMode = BlendMode.SrcOut,
                    color = Color.Transparent
                )

                // Destination
                drawContent()
            }
    ) {
        Spacer(
            modifier = Modifier.height(
                height.div(2) + with(density) { statusBarHeight.toDp() } // Ajuste para alinhar com a Status Bar
            )
        )
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height)
                .clip(CircleShape)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview
@Composable
fun HomeHeaderPreview() {
    PortfolioTheme() {
        HomeHeader(
            background = Color.Red,
            height = 200.dp
        )
    }
}
