# Color Roles — How to Use Color Tokens in Components

## Core Concept

Colors have **roles**, not names. You never pick "blue" — you pick "primary action color", and whatever color is assigned to that role gets applied everywhere consistently.

---

## The Role System

Material 3 divides colors into **pairs**: a background color + a content color that sits on top of it. Always used together.

| Background role | Content on top | Used for |
|---|---|---|
| `primary` | `onPrimary` | Main action buttons, key UI elements |
| `secondary` | `onSecondary` | Supporting actions, chips, filters |
| `tertiary` | `onTertiary` | Accent, highlights, contrast elements |
| `surface` | `onSurface` | Cards, sheets, default backgrounds |
| `surfaceVariant` | `onSurfaceVariant` | Input fields, inactive tabs, secondary cards |
| `background` | `onBackground` | The screen background itself |
| `error` | `onError` | Error states, destructive actions |

**Rule:** if you paint something with `primary`, its text/icon must use `onPrimary`. Never mix pairs.

---

## Where to Apply Each Role in a Component

Think of any component as having three layers:

```
[ container / background ]   ← surface, primary, secondary...
    [ content / text/icon ]  ← onSurface, onPrimary...
    [ border / outline ]     ← outline, outlineVariant
```

**Button:**
- Filled button → container: `primary`, label: `onPrimary`
- Outlined button → container: transparent, border: `outline`, label: `primary`
- Text button → no container, label: `primary`

**Card:**
- Container: `surface` or `surfaceVariant`
- Title text: `onSurface`
- Subtitle/caption: `onSurfaceVariant` (slightly muted — same surface, lower emphasis)

**Input field:**
- Background: `surfaceVariant`
- Typed text: `onSurface`
- Placeholder: `onSurfaceVariant`
- Focused border: `primary`
- Error border: `error`

**Icon:**
- Active/selected: `primary`
- Inactive: `onSurfaceVariant`
- On a colored container: use the matching `on*` color

---

## The One Rule That Solves Most Confusion

> **Emphasis = opacity on `onSurface`, not a different color.**

Instead of picking a lighter color for secondary text, use `onSurface` at lower opacity:
- High emphasis (titles): `onSurface` at 100%
- Medium emphasis (body): `onSurface` at 74%
- Low emphasis (captions, hints): `onSurface` at 38%

This keeps your palette small and your hierarchy consistent across light and dark themes automatically.

---

## Surface Tokens — Deep Dive

### What Is a Surface?

A surface is any flat area in your UI that **holds content**. Think of it like physical layers of paper stacked on a table.

The table itself is `background`. Every sheet of paper you place on it is a `surface`. A sheet placed on top of another sheet is a surface at a higher elevation — slightly tinted to signal it's "above".

```
┌─────────────────────────────────┐
│  background (the table)         │
│                                 │
│  ┌───────────────────────────┐  │
│  │  surface (a sheet)        │  │
│  │                           │  │
│  │  ┌─────────────────────┐  │  │
│  │  │ surfaceContainerHigh│  │  │
│  │  │ (sheet on a sheet)  │  │  │
│  │  └─────────────────────┘  │  │
│  └───────────────────────────┘  │
└─────────────────────────────────┘
```

In practice:
- The **screen** → `background`
- A **scrollable list area** → `surface`
- A **card** → `surfaceContainer`
- A **bottom sheet** → `surfaceContainerHigh`
- A **dialog** → `surfaceContainerHighest`

Every time something visually "floats above" something else, it goes up one surface level. The tint gets slightly stronger at each level so the user subconsciously perceives depth — no shadows needed.

---

### The Mental Model: Elevation = Tint

In Material 3, surfaces don't use drop shadows to express elevation — they use **color tint**. The higher something is, the more the primary color bleeds into its surface. This is automatic when you use the right tokens.

```
Screen background  (lowest)   → background
  └── Page content             → surface
        └── Card               → surface (elevated = slightly tinted)
              └── Bottom sheet → surfaceContainerHigh
                    └── Dialog → surfaceContainerHighest
```

---

### All Surface Tokens and Their Purpose

| Token | Role |
|---|---|
| `background` | The canvas behind everything — the screen itself |
| `surface` | Default container: cards, lists, main content areas |
| `surfaceVariant` | Alternative container: chips, input fields, secondary cards |
| `surfaceTint` | The primary color used to tint elevated surfaces — rarely applied directly |
| `surfaceDim` | A darkened surface — useful for scrim/overlay behind modals |
| `surfaceBright` | A brightened surface — high contrast areas, spotlights |
| `surfaceContainerLowest` | Lowest container elevation — sunken areas, inset panels |
| `surfaceContainerLow` | Slightly raised — navigation rail, side drawers |
| `surfaceContainer` | Default raised container — cards, standard sheets |
| `surfaceContainerHigh` | More raised — bottom sheets, persistent panels |
| `surfaceContainerHighest` | Highest — dialogs, menus, tooltips |

> **The `surfaceContainer*` family replaces the old elevation overlays.** In M3 you pick the right container token instead of setting an elevation number.

---

### Content on Surfaces — Which "on" Token to Use

All surface tokens share just **two** content tokens:

| Situation | Token |
|---|---|
| Primary text, icons, important content on any surface | `onSurface` |
| Secondary text, placeholders, inactive icons on any surface | `onSurfaceVariant` |

This is intentional — no matter which surface level you're on, text color stays consistent. The surface changes, the text rule doesn't.

---

### The Outline Tokens

Borders and dividers live in the surface family too:

| Token | Use |
|---|---|
| `outline` | Visible borders — focused input fields, card strokes |
| `outlineVariant` | Subtle dividers — list separators, inactive borders |

---

### Real Component Examples

**Screen layout:**
```
background          ← Scaffold background
  surface           ← LazyColumn / content area
    surfaceContainer ← Card
      onSurface     ← Card title
      onSurfaceVariant ← Card subtitle
```

**Bottom sheet:**
```
surfaceContainerHigh    ← Sheet background
  onSurface             ← Sheet title
  outlineVariant        ← Divider inside sheet
```

**Dialog:**
```
surfaceContainerHighest ← Dialog background
  onSurface             ← Dialog title + body
  primary               ← Confirm button label
  onSurfaceVariant      ← Cancel button label
```

**Navigation bar:**
```
surfaceContainer        ← Nav bar background
  onSurfaceVariant      ← Inactive icon + label
  onSecondaryContainer  ← Active icon + label (sits on secondaryContainer indicator)
```

---

### Common Mistakes with Surface Tokens

1. **Using `background` for cards** — background is only for the screen itself, not containers
2. **Using `surface` for everything** — the container hierarchy exists to create depth; use `surfaceContainer*` for elevated elements
3. **Hardcoding white/gray** — in dark theme, `surface` is dark; hardcoded white breaks the theme
4. **Ignoring `surfaceVariant`** — it's the right choice for input fields and chips, not plain `surface`

---

## Practical Decision Tree

When choosing a color for any element, ask:

1. **Is it the main action?** → `primary` / `onPrimary`
2. **Is it a supporting action?** → `secondary` / `onSecondary`
3. **Is it a container/card?** → `surface` / `onSurface`
4. **Is it text on a white/neutral background?** → `onBackground` or `onSurface`
5. **Is it inactive, placeholder, or subtle?** → `onSurfaceVariant`
6. **Is it an error or destructive?** → `error` / `onError`
