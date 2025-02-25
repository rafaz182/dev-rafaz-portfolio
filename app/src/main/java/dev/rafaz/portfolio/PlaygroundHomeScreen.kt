package dev.rafaz.portfolio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import dev.rafaz.portfolio.ui.NavigationBarBottomMargin
import dev.rafaz.portfolio.ui.SystemGestureMargin

@Composable
fun PlaygroundHomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SystemGestureMargin {
            NavigationBarBottomMargin {
                Text(text = stringResource(id = R.string.phm_description))
            }
        }
    }
}