package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.navigation.Pages
import com.example.ecommerce.ui.commonuicomponent.ProductCard

@Composable
fun MyLazyGrid(
    navController: NavHostController?,
    modifier: Modifier = Modifier,
    products: List<ProductModel>,
) {


    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        itemsIndexed(products) { index, it ->
            ProductCard(title = it.title,
                images = it.images,
                price = it.price.toString(),
                categoryName = it.category.name,
                onClick = {
                    navController!!.navigate("${Pages.PRODUCT_DETAILS.name}/${index}")
                })
        }
    }


}


@Preview
@Composable
private fun MyLazyGridPreview() {

    val p = ProductModel()

    MyLazyGrid(
        navController = null,
        products = listOf(
            p,
            p,
            p,
            p,
            p,
        )
    )


}