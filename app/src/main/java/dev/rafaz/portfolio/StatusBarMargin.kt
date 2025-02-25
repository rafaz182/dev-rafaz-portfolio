package dev.rafaz.portfolio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StatusBarMargin(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column(
        modifier = modifier
    ) {
        Spacer(modifier = modifier.statusBarsPadding())
        content()
    }
}