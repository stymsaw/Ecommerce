package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.models.response.category.CategoryModel
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.ui.commonuicomponent.ProductCard
import com.example.ecommerce.viewmodel.HomeScreenVM

@Composable
fun HomeScreen(
    itemList: List<String> = List(15) { index -> "Category ${index + 1}" },
    categories: List<CategoryModel> = FakeCategories.getCategories()
) {


    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier.height(50.dp))
        Text(text = "Categories")
        LazyRow {
            items(categories) {
                CategoryCard(categoryName = it.name, categoryImage = it.image)
            }
        }


        Box(modifier = Modifier.height(30.dp))
        Text(text = "Products")
        LazyVerticalGrid(
             columns = GridCells.Fixed(2)
        ) {
            items(itemList) {
                ProductCard(categoryName = it)
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {

    val itemList = List(15) { index -> "Category ${index + 1}" }
    HomeScreen(itemList = itemList)


}