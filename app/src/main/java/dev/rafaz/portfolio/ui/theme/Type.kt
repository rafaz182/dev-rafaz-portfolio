package dev.rafaz.portfolio.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rafaz.portfolio.R
import dev.rafaz.portfolio.ui.NavigationBarBottomMargin
import dev.rafaz.portfolio.ui.SystemGestureMargin


val OpenSansFontFamily = FontFamily(
    Font(resId = R.font.opensans_regular, weight = FontWeight.Normal),
    Font(resId = R.font.opensans_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(resId = R.font.opensans_light, weight = FontWeight.Light),
    Font(resId = R.font.opensans_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(resId = R.font.opensans_medium, weight = FontWeight.Medium),
    Font(resId = R.font.opensans_medium, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(resId = R.font.opensans_bold, weight = FontWeight.Bold),
    Font(resId = R.font.opensans_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(resId = R.font.opensans_extra_bold, weight = FontWeight.ExtraBold),
    Font(resId = R.font.opensans_extra_bold_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(resId = R.font.opensans_semi_bold, weight = FontWeight.SemiBold),
    Font(resId = R.font.opensans_semi_bold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
)

val RobotoFontFamily = FontFamily(
    Font(resId = R.font.roboto_regular, weight = FontWeight.Normal),
    Font(resId = R.font.roboto_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(resId = R.font.roboto_light, weight = FontWeight.Light),
    Font(resId = R.font.roboto_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(resId = R.font.roboto_medium, weight = FontWeight.Medium),
    Font(resId = R.font.roboto_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(resId = R.font.roboto_black, weight = FontWeight.Black),
    Font(resId = R.font.roboto_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
    Font(resId = R.font.roboto_bold, weight = FontWeight.Bold),
    Font(resId = R.font.roboto_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(resId = R.font.roboto_thin, weight = FontWeight.Thin),
    Font(resId = R.font.roboto_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic)
)

val BitterFontFamily = FontFamily(
    Font(resId = R.font.bitter_regular, weight = FontWeight.Normal),
    Font(resId = R.font.bitter_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(resId = R.font.bitter_light, weight = FontWeight.Light),
    Font(resId = R.font.bitter_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(resId = R.font.bitter_extra_light, weight = FontWeight.ExtraLight),
    Font(resId = R.font.bitter_extra_light_italic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(resId = R.font.bitter_medium, weight = FontWeight.Medium),
    Font(resId = R.font.bitter_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(resId = R.font.bitter_black, weight = FontWeight.Black),
    Font(resId = R.font.bitter_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
    Font(resId = R.font.bitter_bold, weight = FontWeight.Bold),
    Font(resId = R.font.bitter_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(resId = R.font.bitter_extra_bold, weight = FontWeight.ExtraBold),
    Font(resId = R.font.bitter_extra_bold_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(resId = R.font.bitter_semi_bold, weight = FontWeight.SemiBold),
    Font(resId = R.font.bitter_semi_bold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(resId = R.font.bitter_thin, weight = FontWeight.Thin),
    Font(resId = R.font.bitter_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.0.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.0.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.2.sp
    ),
    bodySmall = TextStyle(
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.0.sp,
        lineHeight = 16.0.sp,
        letterSpacing = 0.4.sp
    ),

    titleLarge = TextStyle(
        fontFamily = OpenSansFontFamily, //brand ?
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = OpenSansFontFamily, //plain ? can change from large
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.0.sp,
        letterSpacing = 0.2.sp
    ),
    titleSmall = TextStyle(
        fontFamily = OpenSansFontFamily, //plain
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.1.sp
    ),

    headlineLarge = TextStyle(
        fontFamily = BitterFontFamily, //brand
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = BitterFontFamily, //brand
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = BitterFontFamily, //brand
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    labelLarge = TextStyle(),
    labelMedium = TextStyle(),
    labelSmall = TextStyle(),

    displayLarge = TextStyle(),
    displayMedium = TextStyle(),
    displaySmall = TextStyle()
)

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun TypePreview() {
    PortfolioTheme {
        SystemGestureMargin {
            NavigationBarBottomMargin {
                Column {
                    Text(
                        text = "body large text style",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "body medium text style",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "body small text style",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "headline large text style",
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "headline medium text style",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "headline small text style",
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "title large text style",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "title medium text style",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "title small text style",
                        style = MaterialTheme.typography.titleSmall
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                }
            }
        }
    }
}