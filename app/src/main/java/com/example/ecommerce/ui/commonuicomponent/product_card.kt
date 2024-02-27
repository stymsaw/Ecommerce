package com.example.ecommerce.ui.commonuicomponent

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.ecommerce.R

@Composable
fun ProductCard(
    @DrawableRes productImage: Int
) {

    Column {
        Text(text = "Products")
        Box {

            Image(painter = painterResource(id = productImage), contentDescription = null)

        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun ProductCardPreview() {
    ProductCard(
        productImage = R.drawable.img_1
    )
}