# NowInAndroid — Design System Extraction

Source: `G:\Documents\2026-05-26 - Compose 4 Senior\nowinandroid\core\designsystem`

---

## Folder Structure

```
core/designsystem/
├── component/
│   ├── Background.kt       (NiaBackground, NiaGradientBackground)
│   ├── Button.kt           (NiaButton, NiaOutlinedButton, NiaTextButton)
│   ├── Chip.kt             (NiaFilterChip)
│   ├── DynamicAsyncImage.kt
│   ├── IconButton.kt       (NiaIconToggleButton)
│   ├── LoadingWheel.kt     (NiaLoadingWheel, NiaOverlayLoadingWheel)
│   ├── Navigation.kt       (NiaNavigationBar, NiaNavigationRail, NiaNavigationSuiteScaffold)
│   ├── Tabs.kt             (NiaTab, NiaTabRow)
│   ├── Tag.kt              (NiaTopicTag)
│   ├── TopAppBar.kt        (NiaTopAppBar)
│   ├── ViewToggle.kt       (NiaViewToggleButton)
│   └── scrollbar/
├── icon/
│   └── NiaIcons.kt
└── theme/
    ├── Color.kt
    ├── Type.kt
    ├── Theme.kt
    ├── Gradient.kt
    ├── Background.kt
    └── Tint.kt
```

---

## Color Tokens

### Layer 1 — Primitive Colors (raw values)

| Token | Value |
|---|---|
| `Blue10` | `#001F28` |
| `Blue20` | `#003544` |
| `Blue30` | `#004D61` |
| `Blue40` | `#006780` |
| `Blue80` | `#5DD5FC` |
| `Blue90` | `#B8EAFF` |
| `Green10` | `#00210B` |
| `Green20` | `#003919` |
| `Green30` | `#005227` |
| `Green40` | `#006D36` |
| `Green80` | `#0EE37C` |
| `Green90` | `#5AFF9D` |
| `DarkGreen10` | `#0D1F12` |
| `DarkGreen20` | `#223526` |
| `DarkGreen30` | `#394B3C` |
| `DarkGreen40` | `#4F6352` |
| `DarkGreen80` | `#B7CCB8` |
| `DarkGreen90` | `#D3E8D3` |
| `Purple10` | `#36003C` |
| `Purple20` | `#560A5D` |
| `Purple30` | `#702776` |
| `Purple40` | `#8B418F` |
| `Purple80` | `#FFA9FE` |
| `Purple90` | `#FFD6FA` |
| `Orange10` | `#380D00` |
| `Orange20` | `#5B1A00` |
| `Orange30` | `#812800` |
| `Orange40` | `#A23F16` |
| `Orange80` | `#FFB59B` |
| `Orange90` | `#FFDBCF` |
| `Red10` | `#410002` |
| `Red20` | `#690005` |
| `Red30` | `#93000A` |
| `Red40` | `#BA1A1A` |
| `Red80` | `#FFB4AB` |
| `Red90` | `#FFDAD6` |
| `Teal10` | `#001F26` |
| `Teal20` | `#02363F` |
| `Teal30` | `#214D56` |
| `Teal40` | `#3A656F` |
| `Teal80` | `#A2CED9` |
| `Teal90` | `#BEEF6` |

**Neutral palettes:** `DarkGreenGray10–99`, `DarkPurpleGray10–99`, `GreenGray30–90`, `PurpleGray30–90`

---

### Layer 2 — Semantic Color Schemes

Two themes × two modes = 4 color schemes total.

#### Default Theme (Purple-based)

| Role | Light | Dark |
|---|---|---|
| `primary` | `Purple40` | `Purple80` |
| `onPrimary` | White | `Purple20` |
| `primaryContainer` | `Purple90` | `Purple30` |
| `onPrimaryContainer` | `Purple10` | `Purple90` |
| `secondary` | `Orange40` | `Orange80` |
| `onSecondary` | White | `Orange20` |
| `secondaryContainer` | `Orange90` | `Orange30` |
| `onSecondaryContainer` | `Orange10` | `Orange90` |
| `tertiary` | `Blue40` | `Blue80` |
| `onTertiary` | White | `Blue20` |
| `tertiaryContainer` | `Blue90` | `Blue30` |
| `onTertiaryContainer` | `Blue10` | `Blue90` |
| `error` | `Red40` | `Red80` |
| `background` | `DarkPurpleGray99` | `DarkPurpleGray10` |
| `onBackground` | `DarkPurpleGray10` | `DarkPurpleGray90` |
| `surface` | `DarkPurpleGray99` | `DarkPurpleGray10` |
| `onSurface` | `DarkPurpleGray10` | `DarkPurpleGray90` |
| `surfaceVariant` | `PurpleGray90` | `PurpleGray30` |
| `onSurfaceVariant` | `PurpleGray30` | `PurpleGray80` |
| `outline` | `PurpleGray50` | `PurpleGray60` |

#### Android Theme (Green-based)

| Role | Light | Dark |
|---|---|---|
| `primary` | `Green40` | `Green80` |
| `onPrimary` | White | `Green20` |
| `primaryContainer` | `Green90` | `Green30` |
| `secondary` | `DarkGreen40` | `DarkGreen80` |
| `tertiary` | `Teal40` | `Teal80` |
| `background` | `DarkGreenGray99` | `DarkGreenGray10` |
| `surface` | `DarkGreenGray99` | `DarkGreenGray10` |
| `surfaceVariant` | `GreenGray90` | `GreenGray30` |
| `outline` | `GreenGray50` | `GreenGray60` |

> The number suffix in primitive tokens encodes lightness: `10` = very dark, `90` = very light, `80` = light. In dark mode, light primitives (80/90) become backgrounds; dark primitives (10/20) become containers.

---

## Typography Tokens

All defined in `NiaTypography`. No custom font family — uses system default.

| Style | Weight | Size | Line Height | Letter Spacing |
|---|---|---|---|---|
| `displayLarge` | Normal | 57.sp | 64.sp | -0.25.sp |
| `displayMedium` | Normal | 45.sp | 52.sp | 0.sp |
| `displaySmall` | Normal | 36.sp | 44.sp | 0.sp |
| `headlineLarge` | Normal | 32.sp | 40.sp | 0.sp |
| `headlineMedium` | Normal | 28.sp | 36.sp | 0.sp |
| `headlineSmall` | Normal | 24.sp | 32.sp | 0.sp |
| `titleLarge` | **Bold** | 22.sp | 28.sp | 0.sp |
| `titleMedium` | **Bold** | 18.sp | 24.sp | 0.1.sp |
| `titleSmall` | Medium | 14.sp | 20.sp | 0.1.sp |
| `bodyLarge` | Normal | 16.sp | 24.sp | 0.5.sp |
| `bodyMedium` | Normal | 14.sp | 20.sp | 0.25.sp |
| `bodySmall` | Normal | 12.sp | 16.sp | 0.4.sp |
| `labelLarge` | Medium | 14.sp | 20.sp | 0.1.sp |
| `labelMedium` | Medium | 12.sp | 16.sp | 0.5.sp |
| `labelSmall` | Medium | 10.sp | 14.sp | 0.sp |

Default text style: `bodyLarge`

---

## Spacing Tokens

Spacing is defined per-component as named constants, not as a centralized scale.

| Constant | Value | Used in |
|---|---|---|
| `TabTopPadding` | 7.dp | NiaTab |
| `ViewToggleButtonContentPadding` | start=16, top=8, end=12, bottom=8 dp | NiaViewToggleButton |
| `ChipBorderWidth` | 1.dp | NiaFilterChip |
| `OutlinedButtonBorderWidth` | 1.dp | NiaOutlinedButton |
| `NavigationBar tonalElevation` | 0.dp | NiaNavigationBar |
| `LoadingWheel canvas` | 48.dp | NiaLoadingWheel |
| `LoadingWheel padding` | 8.dp | NiaLoadingWheel |
| `OverlayLoadingWheel size` | 60.dp | NiaOverlayLoadingWheel |
| `OverlayLoadingWheel shadowElevation` | 8.dp | NiaOverlayLoadingWheel |
| `BackgroundTheme tonalElevation` | 2.dp | NiaBackground |
| `AsyncImage loading indicator` | 80.dp | DynamicAsyncImage |
| `Tab indicator height` | 2.dp | NiaTabRow |

---

## Shape Tokens

| Shape | Value | Used in |
|---|---|---|
| Filter chip shape | `CircleShape` | NiaFilterChip |
| Overlay loading wheel | `RoundedCornerShape(60.dp)` | NiaOverlayLoadingWheel |

All other components use Material 3 default shapes (not overridden).

---

## Alpha / Opacity Tokens

| Constant | Value | Used in |
|---|---|---|
| `DISABLED_CHIP_CONTAINER_ALPHA` | 0.12f | NiaFilterChip |
| `DISABLED_CHIP_CONTENT_ALPHA` | 0.38f | NiaFilterChip |
| `DISABLED_OUTLINED_BUTTON_BORDER_ALPHA` | 0.12f | NiaOutlinedButton |
| `DISABLED_ICON_BUTTON_CONTAINER_ALPHA` | 0.12f | NiaIconToggleButton |
| `UNFOLLOWED_TOPIC_TAG_CONTAINER_ALPHA` | 0.5f | NiaTopicTag |
| `DISABLED_TOPIC_TAG_CONTAINER_ALPHA` | 0.12f | NiaTopicTag |
| Overlay loading wheel surface alpha | 0.83f | NiaOverlayLoadingWheel |

---

## Motion / Animation Tokens

| Constant | Value | Used in |
|---|---|---|
| `ROTATION_TIME` | 12000ms | NiaLoadingWheel |
| `NUM_OF_LINES` | 12 | NiaLoadingWheel |
| Line draw duration | 100ms | NiaLoadingWheel |
| Line draw easing | `FastOutSlowInEasing` | NiaLoadingWheel |
| Line draw delay | `40ms × index` (staggered) | NiaLoadingWheel |
| Rotation easing | `LinearEasing` | NiaLoadingWheel |
| Color keyframe duration | `ROTATION_TIME / 2` | NiaLoadingWheel |

---

## Custom Tokens (Composition Locals)

Three custom token systems beyond MaterialTheme:

### GradientColors
```kotlin
data class GradientColors(
    val top: Color,
    val bottom: Color,
    val container: Color,
)
```
- `LightAndroidGradientColors`: container = `DarkGreenGray95`
- `DarkAndroidGradientColors`: container = `Color.Black`
- Gradient angle: 11.06° off vertical
- Top fade-out at: 0.724f progress
- Bottom fade-in at: 0.2552f progress

### BackgroundTheme
```kotlin
data class BackgroundTheme(
    val color: Color,
    val tonalElevation: Dp,
)
```
Default: surface color at 2.dp tonal elevation.

### TintTheme
```kotlin
data class TintTheme(
    val iconTint: Color = Color.Unspecified,
)
```
Used to tint icons and images to match the primary color dynamically.

---

## How the Theme is Wired

```kotlin
@Composable
fun NiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    androidTheme: Boolean = false,
    disableDynamicTheming: Boolean = true,
    content: @Composable () -> Unit,
)
```

**Selection logic:**
1. `androidTheme = true` → Green-based scheme
2. Dynamic theming enabled + Android 12+ → system dynamic colors
3. Default → Purple-based scheme

**Composition locals provided:**
```kotlin
CompositionLocalProvider(
    LocalGradientColors provides gradientColors,
    LocalBackgroundTheme provides backgroundTheme,
    LocalTintTheme provides tintTheme,
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = NiaTypography,
        content = content,
    )
}
```

---

## Component Library

| Component | Container color | Content color | Special tokens |
|---|---|---|---|
| `NiaButton` | `onBackground` | — | `labelLarge` |
| `NiaOutlinedButton` | transparent | — | `outline` border, `1.dp` width |
| `NiaTextButton` | none | `onBackground` | `labelSmall` |
| `NiaFilterChip` | `primaryContainer` (selected) | — | `CircleShape`, `labelSmall` |
| `NiaIconToggleButton` | `primaryContainer` (checked) | `onPrimaryContainer` | alpha 0.12f disabled |
| `NiaTopicTag` | `primaryContainer` / `surfaceVariant` | — | alpha 0.5f unfollowed |
| `NiaTab` | transparent | `onSurface` | `labelLarge`, 7.dp top padding |
| `NiaTabRow` | transparent | `onSurface` | 2.dp indicator |
| `NiaNavigationBarItem` | `primaryContainer` (selected) | `onPrimaryContainer` / `onSurfaceVariant` | — |
| `NiaNavigationBar` | — | `onSurfaceVariant` | 0.dp elevation |
| `NiaBackground` | `LocalBackgroundTheme` | — | resets tonal elevation |
| `NiaGradientBackground` | `LocalGradientColors` | — | 11.06° gradient |
| `NiaLoadingWheel` | — | `onBackground` → `inversePrimary` | 12s rotation, 12 lines |
| `NiaTopAppBar` | — | `onSurface` | `CenterAlignedTopAppBar` |

---

## Icon Tokens

Defined in `NiaIcons.kt` as references to Material Design icons:

`Add`, `ArrowBack`, `Bookmark`, `BookmarkBorder`, `Bookmarks`, `BookmarksBorder`, `Check`, `Close`, `Grid3x3`, `MoreVert`, `Person`, `Search`, `Settings`, `ShortText`, `Upcoming`, `UpcomingBorder`, `ViewDay`
