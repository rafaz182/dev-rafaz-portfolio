package dev.rafaz.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.      compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemGestures
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.rafaz.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val modifier = Modifier

        setContent {
            PortfolioTheme {
                Surface(
                    modifier = modifier.fillMaxSize(),
                    //color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(modifier = modifier)
                    //ColorScreen()
                    //ActivityRoadmapScreen()
                }
            }
        }
    }
}

@Composable
fun PaddedBox(content: @Composable () -> Unit) {
    Column {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
        )
        Box(
            modifier = Modifier
                .windowInsetsPadding(WindowInsets.systemGestures)
        ) {
            content()
        }
    }
}