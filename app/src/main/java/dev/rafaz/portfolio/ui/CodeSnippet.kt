package dev.rafaz.portfolio.ui.theme

import android.view.View
import android.webkit.WebView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import dev.rafaz.portfolio.ui.theme.PortfolioTheme.dimens

//https://stackoverflow.com/questions/13816464/how-to-load-html-string-in-a-webview
//https://stackoverflow.com/questions/1991219/webview-wrap-content

@Composable
fun CodeSnippet(codeInHtml: String = "", codeInHtmlPath: String = "", contentDescription: String) {
    Card(
        //border = BorderStroke(2.dp,Color.Red),
        elevation = CardDefaults.cardElevation(defaultElevation = dimens.elevation),
    ) {
        AndroidView(
            factory = {
                val content = if (codeInHtmlPath.isNotEmpty()) {
                    it.assets.open(codeInHtmlPath).use { fileStream ->
                        fileStream.readBytes().toString(Charsets.UTF_8)
                    }
                } else {
                    if (codeInHtml.isEmpty()) throw IllegalArgumentException("codeInHtml can't be empty")
                    codeInHtml
                }
                WebView(it).apply {
                    scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
                    settings.loadWithOverviewMode = true
                    loadDataWithBaseURL(null, content, "text/html", "UTF-8", null)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimens.spaceXxxs)
                .clip(shape = MaterialTheme.shapes.small)
        )

        if (contentDescription.isNotEmpty()) {
            Spacer(modifier = Modifier.height(dimens.spaceXxxs))

            Divider(
                color = Color(0xFFC3C3C3),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .padding(horizontal = dimens.spaceXxxs)
            )

            Spacer(modifier = Modifier.height(dimens.spaceXxs))

            Text(
                style = PortfolioTheme.typography.titleSmall,
                text = contentDescription,
                modifier = Modifier.align(Alignment.End).padding(end = dimens.spaceXs, bottom = dimens.spaceXxxs)
            )
        }
    }
}