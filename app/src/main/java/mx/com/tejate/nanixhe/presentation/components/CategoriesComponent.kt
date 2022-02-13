package mx.com.tejate.nanixhe.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import mx.com.tejate.domain.model.Category
import mx.com.tejate.nanixhe.presentation.navigation.Screen
import mx.com.tejate.nanixhe.util.Util

@ExperimentalFoundationApi
@Composable
fun GridCategories(list: List<Category>, navController: NavController) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier.padding(16.dp)
    ) {
        items(list) { item ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
                    .height(100.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .clickable {
                        navController.navigate(Screen.Meals.withArgs(item.name))
                    }
                    .background(color = Util.randomBaseColor()),
            ) {
                Text(
                    text = item.name,
                    modifier = Modifier
                        .padding(4.dp),
                    style = TextStyle(
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
            }
        }
    }
}