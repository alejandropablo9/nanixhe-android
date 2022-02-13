package mx.com.tejate.nanixhe.presentation.screen.meals

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import mx.com.tejate.domain.util.Result
import mx.com.tejate.nanixhe.R
import mx.com.tejate.nanixhe.presentation.components.GridMeals
import mx.com.tejate.nanixhe.presentation.components.ProgressBar

@ExperimentalFoundationApi
@Composable
fun MealsScreen(
    categoryName: String,
    navController: NavHostController,
    viewModel: MealsViewModel = hiltViewModel()
) {
    Scaffold() {
        viewModel.getMeals(categoryName)
        Column(modifier = Modifier.fillMaxSize()) {
            Row {
                Text(
                    text = categoryName,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        fontFamily = FontFamily.SansSerif
                    ),
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
            Column {
                when (val response = viewModel.mealsState.value) {
                    is Result.Loading -> ProgressBar()
                    is Result.Success -> GridMeals(
                        list = response.data?.list ?: emptyList(),
                        navController = navController
                    )
                    is Result.Error -> {
                        Toast.makeText(
                            LocalContext.current,
                            stringResource(R.string.toast_error),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}

