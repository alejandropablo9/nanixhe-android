package mx.com.tejate.nanixhe.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
}
