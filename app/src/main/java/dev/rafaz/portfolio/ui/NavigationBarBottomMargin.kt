package dev.rafaz.portfolio.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NavigationBarBottomMargin(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column {

        content()

        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .navigationBarsPadding()
        )
    }
}