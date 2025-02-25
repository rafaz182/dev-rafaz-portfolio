package dev.rafaz.portfolio.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.foundation.layout.systemGestures
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.isUnspecified
import dev.rafaz.portfolio.ui.theme.PortfolioTheme

@Composable
fun SystemGestureMargin(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        //if the systemGesture inset is zero, use theme margin value
        val leftGestureInset = WindowInsets.systemGestures.asPaddingValues().calculateLeftPadding(
            LocalLayoutDirection.current)
        val leftPadding = if (leftGestureInset.isUnspecified || leftGestureInset.value == 0f)
            PortfolioTheme.dimens.margin
        else leftGestureInset

        val rightGestureInset = WindowInsets.safeGestures.asPaddingValues().calculateRightPadding(
            LocalLayoutDirection.current
        )
        val rightPadding = if (rightGestureInset.isUnspecified || rightGestureInset.value == 0f)
            PortfolioTheme.dimens.margin
        else rightGestureInset

        Spacer(
            modifier = modifier
                .fillMaxHeight()
                .width(leftPadding)
        )
        Box(
            modifier = modifier.weight(1f)
        ) {
            content()
        }
        Spacer(
            modifier = modifier
                .fillMaxHeight()
                .width(rightPadding)
        )
    }
}