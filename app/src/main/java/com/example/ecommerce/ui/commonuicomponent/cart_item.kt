package com.example.ecommerce.ui.commonuicomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Maximize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce.R

@Composable
fun CartItem(
    title: String = "product title",
    categoryName: String = "category name",
    price: String = "$12",
    categoryImage: String = "category image",
    description: String = "product description",
    images: List<String> = listOf("image1", "image2", "image3"),
) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .background(color = Color.Cyan)
            .padding(10.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.img_1), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, shape = CircleShape)
        )

        Column {
            Text(text = title)
            Text(text = price)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        )

        {
            IconButton(onClick = { }) {
                Icon(Icons.Outlined.Delete, contentDescription = "reduce item")
            }
            Text(text = "3", fontSize = 18.sp)
            IconButton(onClick = { }) {
                Icon(Icons.Outlined.Add, contentDescription = "reduce item")
            }
        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun CartItemPreview() {

    CartItem()
}