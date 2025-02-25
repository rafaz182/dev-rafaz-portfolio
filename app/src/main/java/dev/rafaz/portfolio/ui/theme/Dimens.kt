package dev.rafaz.portfolio.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalDim = staticCompositionLocalOf { Dimensions() }

data class Dimensions(
    val default: Dp = 0.dp,

    val headerHeight: Dp = 150.dp,

    val elevation: Dp = 4.dp,

    val spaceXxxs: Dp = 4.dp,
    val spaceXxs: Dp = 8.dp,
    val spaceXs: Dp = 16.dp,
    val spaceSm: Dp = 24.dp,
    val spaceMd: Dp = 32.dp,
    val spaceLg: Dp = 48.dp,
    val spaceXl: Dp = 64.dp,
    val spaceXxl: Dp = 96.dp,
    val spaceXxxl: Dp = 128.dp,

    val margin: Dp = spaceMd
)