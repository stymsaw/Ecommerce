package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.ecommerce.R
import com.example.ecommerce.ui.theme.app_blue_light
import com.example.ecommerce.ui.theme.app_white

@Composable
fun ProductCard(
    categoryName: String = "category name",
    images: List<String> = listOf("image1", "image2", "image3"),
    price: String = "$12",
    title: String = "product title",
    onClick: (() -> Unit)?,
) {

    Column(horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .clip(shape = CircleShape.copy(all = CornerSize(5.dp)))
            .background(color = app_blue_light)
            .padding(10.dp)
            .clickable { onClick!!.invoke() }) {

        AsyncImage(
            model = images[0],
            placeholder = painterResource(id = R.drawable.img_2),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.size(150.dp)
        )
        Box(Modifier.height(5.dp))
        Text(
            text = title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = app_white,
        )
        Box(Modifier.height(5.dp))
        Text(
            text = "Price: $$price",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = app_white
        )
        Box(Modifier.height(5.dp))
        Text(
            text = "Category: $categoryName",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = app_white
        )
        Box(Modifier.height(5.dp))


    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductCardPreview() {

    ProductCard(onClick = null)
}