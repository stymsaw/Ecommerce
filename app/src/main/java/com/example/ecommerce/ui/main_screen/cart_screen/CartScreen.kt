package com.example.ecommerce.ui.main_screen.cart_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerce.ui.commonuicomponent.CartItem

@Composable
fun CartScreen(
    itemList: List<String> = List(15) { index -> "Category ${index + 1}" }
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.height(20.dp))
        LazyColumn {
            items(itemList) {
                CartItem()
            }
        }
    }

}

//
@Preview(showSystemUi = true)
@Composable
fun CartScreenPreview() {

    val itemList = List(15) { index -> "Category ${index + 1}" }
    CartScreen(itemList = itemList)


}