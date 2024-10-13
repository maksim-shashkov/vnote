package com.vnote.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Define your light color scheme (as previously defined)
private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimary,
    primaryContainer = PrimaryVariant,
    secondary = SecondaryColor,
    onSecondary = OnSecondary,
    background = BackgroundColor,
    onBackground = OnBackground,
    surface = SurfaceColor,
    onSurface = OnSurface,
    error = ErrorColor
)

// Define your dark color scheme (new dark theme)
private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryColor,
    onPrimary = DarkOnPrimary,
    primaryContainer = DarkPrimaryVariant,
    secondary = DarkSecondaryColor,
    onSecondary = DarkOnSecondary,
    background = DarkBackgroundColor,
    onBackground = DarkOnBackground,
    surface = DarkSurfaceColor,
    onSurface = DarkOnSurface,
    error = DarkErrorColor
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography, // Ensure your typography is defined here
        shapes = AppShapes, // Ensure your shapes are defined
        content = content
    )
}