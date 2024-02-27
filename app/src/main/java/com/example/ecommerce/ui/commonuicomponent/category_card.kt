package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryCard(
    categoryName: String = "category name",
    categoryImage: String = "category image"
) {

    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .background(color = Color.Cyan)
            .padding(10.dp)
    ) {
        Text(text = categoryName)
        Text(text = categoryImage)


    }

}


@Preview(showSystemUi = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard()
}