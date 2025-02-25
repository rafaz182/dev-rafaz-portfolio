package dev.rafaz.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.DeveloperMode
import androidx.compose.material.icons.outlined.MenuBook
import androidx.compose.material.icons.outlined.RocketLaunch
import androidx.compose.material.icons.outlined.RssFeed
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rafaz.portfolio.ui.HomeHeader
import dev.rafaz.portfolio.ui.NavigationBarBottomMargin
import dev.rafaz.portfolio.ui.SystemGestureMargin
import dev.rafaz.portfolio.ui.theme.PortfolioTheme
import dev.rafaz.portfolio.ui.theme.PortfolioTheme.dimens
import dev.rafaz.portfolio.ui.theme.PortfolioTheme.typography

@Composable
fun HomeScreen(modifier: Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .background(color = colorScheme.background)
    ) {
        HomeHeader(
            height = 100.dp,
            background = colorScheme.primary
        )

        Spacer(modifier = Modifier.height(dimens.spaceXxs))

        Text(
            text = "Rafael Pereira Ramos",
            style = typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            color = colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(dimens.spaceXxxs))

        Text(
            text = "Android Engineer",
            style = typography.titleMedium,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            color = colorScheme.onBackground
        )

        Row(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = "Localized description",
                modifier = Modifier
                    .size(14.dp)
                    .align(alignment = Alignment.CenterVertically)
            )
            Text(
                text = "São Paulo - Brazil",
                style = typography.titleSmall,
                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                color = colorScheme.onBackground
            )
        }

        Spacer(modifier = Modifier.height(dimens.spaceSm))

        HomeSocialContactSection()

        SystemGestureMargin {
            NavigationBarBottomMargin {
                Spacer(modifier = Modifier.height(dimens.spaceMd))

                HorizontalDivider(
                    color = colorScheme.outlineVariant,
                    thickness = 1.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(dimens.spaceMd))

                Text(
                    text = stringResource(id = R.string.hme_about_me),
                    style = typography.bodyLarge,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    color = colorScheme.onBackground
                )

                Spacer(
                    modifier = Modifier.height(dimens.spaceLg)
                )

                /*Card(
                    elevation = CardDefaults.cardElevation(defaultElevation = dimens.elevation),
                    colors = CardDefaults.cardColors(containerColor = colorScheme.primaryContainer),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        Spacer(modifier = Modifier.height(dimens.spaceMd))
                        Row {
                            Spacer(modifier = Modifier.width(dimens.spaceLg))
                            HomeActionButton(
                                icon = Icons.Outlined.RocketLaunch,
                                text = "Experience"
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            HomeActionButton(
                                icon = Icons.Outlined.MenuBook,
                                text = "Background"
                            )
                            Spacer(modifier = Modifier.width(dimens.spaceLg))
                        }
                        Spacer(modifier = Modifier.height(dimens.spaceSm))
                        Row {
                            Spacer(modifier = Modifier.width(dimens.spaceLg))
                            HomeActionButton(
                                icon = Icons.Outlined.DeveloperMode,
                                text = "Playground"
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            HomeActionButton(
                                icon = Icons.Outlined.RssFeed,
                                text = "Blog"
                            )
                            Spacer(modifier = Modifier.width(dimens.spaceLg))
                        }
                        Spacer(modifier = Modifier.height(dimens.spaceMd))
                    }
                }*/
            }
        }
    }
}

@Composable
fun ColumnScope.HomeSocialContactSection(
    onGithubClick: () -> Unit = { },
    onLinkedinClick: () -> Unit = { },
    onTelegramClick: () -> Unit = { }
) {
    Row(
        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
    ) {
        TextButton(
            onClick = onGithubClick,
            colors = ButtonDefaults.textButtonColors(
                contentColor = colorScheme.onBackground,
                disabledContentColor = colorScheme.onSurface.copy(alpha = 0.38f)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_github2),
                contentDescription = null,
                tint = colorScheme.onBackground
            )
            Spacer(modifier = Modifier.width(dimens.spaceXxs))
            Text("GitHub")
        }
        //ContactButton(iconRes = R.drawable.icon_github2, value = "GitHub")
        Spacer(modifier = Modifier.width(dimens.spaceSm))
        TextButton(
            onClick = onLinkedinClick,
            colors = ButtonDefaults.textButtonColors(
                contentColor = colorScheme.onBackground,
                disabledContentColor = colorScheme.onSurface.copy(alpha = 0.38f)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_linkedin),
                contentDescription = null,
                tint = colorScheme.onBackground
            )
            Spacer(modifier = Modifier.width(dimens.spaceXxs))
            Text("LinkedIn")
        }
        //ContactButton(iconRes = R.drawable.icon_linkedin, value = "LinkedIn")
        Spacer(modifier = Modifier.width(dimens.spaceSm))
        TextButton(
            onClick = onTelegramClick,
            colors = ButtonDefaults.textButtonColors(
                contentColor = colorScheme.onBackground,
                disabledContentColor = colorScheme.onSurface.copy(alpha = 0.38f)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_telegram),
                contentDescription = null,
                tint = colorScheme.onBackground
            )
            Spacer(modifier = Modifier.width(dimens.spaceXxs))
            Text("Telegram")
        }
        //ContactButton(iconRes = R.drawable.icon_telegram, value = "Telegram")
    }
}

@Composable
fun HomeActionButton(icon: ImageVector, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = colorScheme.primary),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(all = 15.dp),
        modifier = modifier
            .size(115.dp)
            //.clip(RoundedCornerShape(10.dp))
            //.background(color = Color(0xFF34495E), /*shape = RoundedCornerShape(10.dp)*/)
            //.sizeIn(minWidth = 100.dp, minHeight = 100.dp)
            //.padding(horizontal = 15.dp, vertical = 15.dp),
    ) {
        Column(
            modifier = modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.White
            )
            Spacer(
                modifier = modifier.height(dimens.spaceXs)
            )
            Text(
                text = text,
                style = typography.bodyMedium,
                color = colorScheme.onPrimary,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
            )
        }
    }
}

@Composable
fun ContactButton(iconRes: Int, value: String, onClick: () -> Unit = {}) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = "",
        )
        Spacer(modifier = Modifier.width(dimens.spaceXxs))
        Text(
            text = value,
            style = typography.titleSmall,
            modifier = Modifier.align(alignment = Alignment.CenterVertically)
        )
    }
}

@Composable
fun BoxAlignment() {
    Box(modifier = Modifier.size(height = 90.dp, width = 290.dp)) {
        Text("TopStart", Modifier.align(Alignment.TopStart))
        Text("TopCenter", Modifier.align(Alignment.TopCenter))
        Text("TopEnd", Modifier.align(Alignment.TopEnd))

        Text("CenterStart", Modifier.align(Alignment.CenterStart))
        Text("Center", Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))

        Text("BottomStart", Modifier.align(Alignment.BottomStart))
        Text("BottomCenter", Modifier.align(Alignment.BottomCenter))
        Text("BottomEnd", Modifier.align(Alignment.BottomEnd))
    }
}




@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeScreenPreview() {
    val modifier = Modifier
    PortfolioTheme {
        HomeScreen(modifier = modifier)
    }
}
