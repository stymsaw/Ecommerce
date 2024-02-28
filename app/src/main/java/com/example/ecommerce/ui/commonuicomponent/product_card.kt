package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.ecommerce.R

@Composable
fun ProductCard(
    categoryName: String = "category name",
    categoryImage: String = "category image",
    description: String = "product image",
    images: List<String> = listOf("image1", "image2", "image3"),
    price: String = "$12",
    title: String = "product title",
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .background(color = Color.Cyan)
            .padding(10.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.img_2), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .border(1.dp, Color.Gray, shape = RectangleShape)
        )
        Text(text = title)
        Text(text = price)
        Text(text = description)
        Text(text = categoryName)
        Text(text = categoryImage)


    }

}


@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {

    ProductCard()
}