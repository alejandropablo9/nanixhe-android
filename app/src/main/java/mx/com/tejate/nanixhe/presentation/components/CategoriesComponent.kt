package mx.com.tejate.nanixhe.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mx.com.tejate.domain.model.Category
import mx.com.tejate.nanixhe.ui.theme.Purple200
import mx.com.tejate.nanixhe.ui.theme.Purple700

@Composable
fun CategoriesComponent(list: List<Category>) {
    LazyRow {
        items(list) { item ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(2.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Purple700),
            ) {
                Text(
                    text = item.name,
                    modifier = Modifier
                        .padding(4.dp),
                    style = TextStyle(
                        color = Purple200,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}