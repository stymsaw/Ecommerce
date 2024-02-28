package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.ecommerce.R
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.models.response.category.CategoryModel

@Composable
fun CategoryCard(
    categoryName: String = "category name",
    categoryImage: String = "category name",
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable { }
            .padding(5.dp)
            .padding(15.dp)
    ) {

        AsyncImage(
            model = categoryImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(RectangleShape)
                .border(2.dp, Color.Gray, shape = RectangleShape)
        )
        Box(
            modifier = Modifier
                .height(5.dp)
        )
        Text(text = categoryName)


    }

}


@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard()
}