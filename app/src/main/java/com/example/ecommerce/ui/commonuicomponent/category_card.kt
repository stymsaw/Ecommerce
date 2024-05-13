package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.ecommerce.ui.theme.app_blue_light

@Composable
fun CategoryCard(
    categoryName: String = "category name",
    categoryImage: String = "https://picsum.photos/200",
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { }
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .clip(CircleShape)
            .background(color = app_blue_light)
            .padding(horizontal = 5.dp, vertical = 5.dp)
    ) {

        AsyncImage(
            model = categoryImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, shape = CircleShape)
        )

        Box(modifier = Modifier.width(10.dp))
        Text(text = categoryName, color = Color.White)
        Box(modifier = Modifier.width(20.dp))


    }

}


@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard()
}