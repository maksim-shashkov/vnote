package com.vnote.ui.theme

import androidx.compose.ui.graphics.Color

//region Light theme colors

// Primary color (dark gray)
val PrimaryColor = Color(0xFF333333)
val PrimaryVariant = Color(0xFF1C1C1C) // A darker variant of the primary color

// Secondary color (for accents, buttons, etc.)
val SecondaryColor = Color(0xFFBB86FC) // Light purple
val SecondaryVariant = Color(0xFF3700B3) // Dark purple

// Background and Surface colors
val BackgroundColor = Color(0xFFF5F5F5) // Light background to contrast with dark primary color
val SurfaceColor = Color(0xFFFFFFFF) // Surface color for components like cards, etc.
val ErrorColor = Color(0xFFCF6679) // Error color (default red for errors)

// On colors (text, icons, etc.)
val OnPrimary = Color(0xFFFFFFFF) // White text on primary color
val OnSecondary = Color(0xFF000000) // Black text on secondary color
val OnBackground = Color(0xFF000000) // Black text on background color
val OnSurface = Color(0xFF000000) // Black text on surface color

//endregion

//region Dark theme colors

// Primary color (a lighter variant for the dark theme to ensure visibility)
val DarkPrimaryColor = Color(0xFFBBBBBB) // Lighter gray for dark mode
val DarkPrimaryVariant = Color(0xFF888888) // Darker gray but still light enough for dark mode contrast

// Secondary color (use the same secondary, or slightly adjust brightness for dark mode)
val DarkSecondaryColor = Color(0xFFBB86FC) // Same light purple for consistency
val DarkSecondaryVariant = Color(0xFF6200EA) // Slightly lighter variant of dark purple

// Background and Surface colors (darker shades to suit the dark theme)
val DarkBackgroundColor = Color(0xFF121212) // Very dark background to contrast with light elements
val DarkSurfaceColor = Color(0xFF1E1E1E) // A lighter dark gray for surfaces like cards, dialogs, etc.
val DarkErrorColor = Color(0xFFCF6679) // Error color remains consistent

// On colors (text, icons, etc. for dark backgrounds)
val DarkOnPrimary = Color(0xFF000000) // Black text on lighter primary color
val DarkOnSecondary = Color(0xFFFFFFFF) // White text on secondary color
val DarkOnBackground = Color(0xFFFFFFFF) // White text on dark background
val DarkOnSurface = Color(0xFFFFFFFF) // White text on dark surfaces

//endregion