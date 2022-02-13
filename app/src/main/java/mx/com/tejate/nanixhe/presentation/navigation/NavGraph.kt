package mx.com.tejate.nanixhe.presentation.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import mx.com.tejate.nanixhe.presentation.screen.categories.CategoriesScreen
import mx.com.tejate.nanixhe.presentation.screen.meals.MealsScreen

@ExperimentalFoundationApi
@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Categories.route
    ) {
        composable(route = Screen.Categories.route) {
            CategoriesScreen(navController = navController)
        }
        composable(route = Screen.Meals.route + "/{categoryName}", arguments = listOf(
            navArgument("categoryName") {
                type = NavType.StringType
                defaultValue = ""
            }
        )) { entry ->
            MealsScreen(
                categoryName = entry.arguments?.getString("categoryName").orEmpty(),
                navController = navController
            )
        }
    }

}