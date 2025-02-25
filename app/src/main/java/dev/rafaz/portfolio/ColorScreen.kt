package dev.rafaz.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rafaz.portfolio.ui.theme.PortfolioTheme

@Composable
fun ColorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(red = 33, 254, 98))
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .systemBarsPadding()
        )
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(
                modifier = Modifier
                    .windowInsetsPadding(WindowInsets.systemGestures.only(WindowInsetsSides.Start))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {

                //region background
                ColorItem("background", MaterialTheme.colorScheme.background, stringResource(R.string.color_background_description))
                ColorItem("onBackground", MaterialTheme.colorScheme.onBackground)
                //endregion

                //region primary
                ColorItem("primary", MaterialTheme.colorScheme.primary, stringResource(R.string.color_primary_description))
                ColorItem("onPrimary", MaterialTheme.colorScheme.onPrimary, stringResource(R.string.color_on_description))
                ColorItem("primaryContainer", MaterialTheme.colorScheme.primaryContainer)
                ColorItem("onPrimaryContainer", MaterialTheme.colorScheme.onPrimaryContainer)
                ColorItem("inversePrimary", MaterialTheme.colorScheme.inversePrimary)
                //endregion

                //region secondary
                ColorItem("secondary", MaterialTheme.colorScheme.secondary, stringResource(R.string.color_secondary_description))
                ColorItem("onSecondary", MaterialTheme.colorScheme.onSecondary)
                ColorItem("secondaryContainer", MaterialTheme.colorScheme.secondaryContainer)
                ColorItem("onSecondaryContainer", MaterialTheme.colorScheme.onSecondaryContainer)
                //endregion

                //region tertiary
                ColorItem("tertiary", MaterialTheme.colorScheme.tertiary)
                ColorItem("onTertiary", MaterialTheme.colorScheme.onTertiary)
                ColorItem("tertiaryContainer", MaterialTheme.colorScheme.tertiaryContainer)
                ColorItem("onTertiaryContainer", MaterialTheme.colorScheme.onTertiaryContainer)
                //endregion

                //region surface
                ColorItem("surface", MaterialTheme.colorScheme.surface, stringResource(R.string.color_surface_description))
                ColorItem("onSurface", MaterialTheme.colorScheme.onSurface)
                ColorItem("surfaceVariant", MaterialTheme.colorScheme.surfaceVariant)
                ColorItem("onSurfaceVariant", MaterialTheme.colorScheme.onSurfaceVariant)
                ColorItem("surfaceTint", MaterialTheme.colorScheme.surfaceTint)
                ColorItem("inverseSurface", MaterialTheme.colorScheme.inverseSurface)
                ColorItem("inverseOnSurface", MaterialTheme.colorScheme.inverseOnSurface)
                //endregion

                //region error
                ColorItem("error", MaterialTheme.colorScheme.error, stringResource(R.string.color_error_description))
                ColorItem("onError", MaterialTheme.colorScheme.onError)
                ColorItem("errorContainer", MaterialTheme.colorScheme.errorContainer)
                ColorItem("onErrorContainer", MaterialTheme.colorScheme.onErrorContainer)
                //endregion

                //region outline
                ColorItem("outline", MaterialTheme.colorScheme.outline)
                ColorItem("outlineVariant", MaterialTheme.colorScheme.outlineVariant)
                //endregion

                ColorItem("scrim", MaterialTheme.colorScheme.scrim)
            }
            Spacer(
                modifier = Modifier
                    .windowInsetsPadding(WindowInsets.systemGestures.only(WindowInsetsSides.End))
            )
        }
    }
}

@Composable
fun ColorItem(name: String, color: Color, description: String = "") {
    Column(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 60.dp)
            .background(color)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "$name ${color.toHexString()}",
                modifier = Modifier
                    .background(Color.White)
            )
        }
        Spacer(
            modifier = Modifier.height(30.dp)
        )
        Text(
            text = description
        )
    }
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(5.dp)
    )
}

fun Color.toHexString(): String {
    return "#${(value shr 32).toString(16)}"
}

@Preview
@Composable
fun ColorScreenPreview() {
    PortfolioTheme {
        ColorScreen()
    }
}