# devrafazportfolio — Project Insights (2026-05-27)

## What it is
Personal portfolio Android app that doubles as an Android learning playground. Built with Jetpack Compose + Material 3.

**Tech Stack:**
- Kotlin 2.1.0 / AGP 8.8.1 / compileSdk 35 / minSdk 23
- Compose BOM 2025.02.00 (Material 3)
- Firebase BOM 33.9.0 (Analytics only, not yet used)
- Java target: VERSION_19

## Screens Built
- HomeScreen (profile, bio, social links — main working screen)
- ExperienceScreen (data models exist, partially implemented)
- ActivityRoadmapScreen (Android fundamentals tutorial with code snippets)
- ColorScreen (Material 3 color showcase)
- PlaygroundHomeScreen (placeholder)

> Experience, Color, Roadmap screens are commented out in MainActivity — not yet reachable.

## Strengths
- Custom theming: 8-color palette, 10-tier spacing scale, 3 font families, dynamic colors (Android 12+)
- Edge-to-edge layout with proper inset wrappers
- Type-safe version catalog (libs.versions.toml)
- Preview annotations throughout composables

## Key Issues
| Issue | Detail |
|---|---|
| No navigation framework | 5 screens exist but no nav graph wires them |
| No ViewModel / state management | No architecture layer |
| Screens unreachable | Commented out in MainActivity |
| Typo: `ExperienceScree()` | Missing `n` in function name |
| Legacy date API | `java.util.Date` + `SimpleDateFormat` — prefer `java.time` |
| Firebase unused | Integrated but zero analytics events tracked |

## Biggest Opportunity
Add **Jetpack Navigation Compose** to connect the 5 existing screens — single change that makes the app feel complete.

## Architecture Recommendation
Screen → ViewModel → Repository pattern, even lightweight, would demonstrate architectural knowledge to anyone reviewing the code professionally.

**Why:** This is a portfolio app — code quality signals matter as much as features.
**How to apply:** Prioritize navigation + ViewModel before adding new screens or features.
