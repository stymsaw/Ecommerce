package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.viewmodel.HomeScreenVM

@Composable
fun HomeScreen(
    itemList: List<String> = List(15) { index -> "Category ${index + 1}" }
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier.height(20.dp))
        LazyRow {
            items(itemList) {
                CategoryCard(categoryName = it)
            }
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {

    val itemList = List(15) { index -> "Category ${index + 1}" }
    HomeScreen(itemList = itemList)


}