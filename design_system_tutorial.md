# Building a Design System for devrafazportfolio

## Step 1 — Audit What You Already Have

Before creating anything new, map what exists:
- List every color used across all screens (hardcoded and from `Color.kt`)
- List every text size, font, and weight in use
- List every spacing value (margins, paddings, gaps)
- List every shape (corner radius, clip shapes)
- Note any inconsistencies — same concept, different values

This audit becomes your "source of truth" inventory.

---

## Step 2 — Define Your Design Tokens

Tokens are the named constants that replace magic values. Define them in four categories:

**Color tokens** — two layers:
- *Primitive tokens*: raw values (`Blue500`, `Gray100`) — you already have these in `Color.kt`
- *Semantic tokens*: role-based names (`colorPrimary`, `colorOnSurface`, `colorError`) — Material 3 handles most of this via `ColorScheme`

**Typography tokens** — for each text style, define:
- Font family, weight, size, line height, letter spacing
- Semantic names: `labelSmall`, `bodyLarge`, `displayMedium`, etc.

**Spacing tokens** — a scale (4, 8, 12, 16, 24, 32, 48, 64…):
- You already have `Dimens.kt` — ensure every spacing value maps to the scale, nothing in-between

**Shape tokens** — corner radii for each component category:
- Small (chips, buttons), Medium (cards), Large (bottom sheets, dialogs)

---

## Step 3 — Organize the Token Structure in Code

Create a clear folder structure inside `ui/theme/`:

```
ui/theme/
├── Color.kt        ← primitive color tokens
├── Type.kt         ← typography scale
├── Dimens.kt       ← spacing + sizing scale
├── Shape.kt        ← shape scale
└── Theme.kt        ← wires all tokens into MaterialTheme
```

Each file should be the *single source of truth* for its category. No color, font size, or spacing should appear anywhere else as a hardcoded value.

---

## Step 4 — Build Your Component Library

With tokens in place, start building reusable components. Work bottom-up:

1. **Atoms** — smallest units: `AppButton`, `AppText`, `AppIcon`, `AppDivider`
2. **Molecules** — combinations: `SocialLinkItem`, `ExperienceCard`, `SectionHeader`
3. **Organisms** — full sections: `HomeHeader`, `ContactSection`, `ExperienceTimeline`

Rules for each component:
- It consumes only tokens — never hardcoded values
- It has a `@Preview` annotated at the bottom
- It exposes only the props it needs — no over-engineering

---

## Step 5 — Write a Component Catalog Screen

Create a `DesignSystemScreen` (you already have `ColorScreen` as a start) that renders every component in all its states:
- Default, pressed, disabled, error states for interactive components
- All text styles together
- The full color palette
- Spacing scale visualized as blocks

This screen is your living documentation — it breaks immediately when a component is broken.

---

## Step 6 — Enforce the System

Set a rule for yourself: **nothing gets added to a screen without a token or component existing first.** If a new UI need comes up:

1. Does a token exist for it? → use it
2. Does a component exist for it? → use it
3. Neither exists? → add the token/component first, *then* use it in the screen

This prevents design drift over time.

---

## Step 7 — Document Usage (Optional but Valuable)

Since this is a portfolio, a short `DESIGN_SYSTEM.md` at the repo root showing your token names and component list signals strong engineering discipline to anyone reading the code.

---

## Suggested Order of Execution

1. Audit existing values
2. Lock down `Dimens.kt` — remove all in-between values
3. Complete the `ColorScheme` in `Theme.kt` so every semantic role is filled
4. Audit and finalize `Type.kt`
5. Build 3–4 atom components
6. Refactor existing screens to use only atoms + tokens
7. Build `DesignSystemScreen` as a catalog
