package dev.rafaz.portfolio.util

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas

fun Modifier.drawWithLayer(block: ContentDrawScope.() -> Unit) = this.then(
    Modifier.drawWithContent {
        drawWithLayer {
            block()
        }
    }
)

fun ContentDrawScope.drawWithLayer(block: ContentDrawScope.() -> Unit) {
    with(drawContext.canvas.nativeCanvas) {
        val checkPoint = saveLayer(null, null)
        block()
        restoreToCount(checkPoint)
    }
}