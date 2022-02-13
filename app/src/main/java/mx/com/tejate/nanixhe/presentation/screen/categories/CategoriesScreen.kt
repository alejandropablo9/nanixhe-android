package mx.com.tejate.nanixhe.presentation.screen.categories

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
import mx.com.tejate.nanixhe.presentation.components.GridCategories
import mx.com.tejate.nanixhe.presentation.components.ProgressBar

@ExperimentalFoundationApi
@Composable
fun CategoriesScreen(navController: NavHostController, viewModel: CategoriesViewModel = hiltViewModel()) {
    Scaffold() {
        Column(modifier = Modifier.fillMaxSize()) {
            Row {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        fontFamily = FontFamily.SansSerif
                    ),
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
            Column {
                when (val response = viewModel.categoriesState.value) {
                    is Result.Loading -> ProgressBar()
                    is Result.Success -> GridCategories(
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

