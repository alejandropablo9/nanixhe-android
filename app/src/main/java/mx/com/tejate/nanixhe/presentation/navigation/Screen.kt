package mx.com.tejate.nanixhe.presentation.navigation

sealed class Screen(val route: String) {
    object Categories : Screen("categories_screen")
    object Meals : Screen("meals_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
