package dev.rafaz.portfolio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import dev.rafaz.portfolio.ui.NavigationBarBottomMargin
import dev.rafaz.portfolio.ui.SystemGestureMargin
import dev.rafaz.portfolio.ui.theme.CodeSnippet
import dev.rafaz.portfolio.ui.theme.PortfolioTheme
import dev.rafaz.portfolio.ui.theme.PortfolioTheme.dimens

@Composable
fun ActivityRoadmapScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        StatusBarMargin {
            SystemGestureMargin {
                NavigationBarBottomMargin {
                    Text(
                        style = PortfolioTheme.typography.titleLarge,
                        text = stringResource(id = R.string.arm_whats_an_activity)
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceXxs))
                    Text(
                        style = PortfolioTheme.typography.bodyMedium,
                        text = stringResource(id = R.string.arm_whats_an_activity_explained)
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceSm))
                    Text(
                        style = PortfolioTheme.typography.titleLarge,
                        text = stringResource(id = R.string.arm_starting_with_activity)
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceXxs))
                    Text(
                        style = PortfolioTheme.typography.bodyMedium,
                        text = stringResource(id = R.string.arm_starting_with_activity_explained)
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceXxs))
                    CodeSnippet(
                        contentDescription = "",
                        codeInHtmlPath = "roadmap/activity_manifest_basic.html"
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceXxs))
                    Text(
                        style = PortfolioTheme.typography.bodyMedium,
                        text = stringResource(id = R.string.arm_starting_with_activity_explained2)
                    )
                    Spacer(modifier = Modifier.height(dimens.spaceXxs))
                    CodeSnippet(
                        codeInHtmlPath = "roadmap/activity_manifest_launch_intent.html",
                        contentDescription = "Code snippet of an intent filter"
                    )
                }
            }
        }
    }
}