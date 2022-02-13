package mx.com.tejate.nanixhe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import mx.com.tejate.nanixhe.presentation.navigation.NavGraph
import mx.com.tejate.nanixhe.ui.theme.NanixheTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NanixheTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
