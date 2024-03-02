package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.asIntState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.mockdata.FakeProducts
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.ui.commonuicomponent.ProductCard
import com.example.ecommerce.viewmodel.HomeScreenVM

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    itemList: List<String> = List(15) { index -> "Category ${index + 1}" },
    categories: List<CategoryModel> = FakeCategories.getCategories(),
    products: List<ProductModel> = FakeProducts.getProducts(),
) {

    val viewModel = viewModel<HomeScreenVM>()
    val pagerState = rememberPagerState(pageCount = {
        viewModel.categories.size
    })

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier.height(50.dp))
        Text(
            text = "Categories",
            fontSize = 18.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 10.dp)

        )

        HorizontalPager(
            state = pagerState,
            pageSize = PageSize.Fixed(180.dp)
        ) {
            val item = categories[it]
            CategoryCard(categoryName = item.name, categoryImage = item.image)
        }

        Box(modifier = Modifier.height(30.dp))
        Text(
            text = "Products",
            fontSize = 18.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 10.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(products) {
                ProductCard(
                    title = it.title,
                    images = it.images,
                    price = it.price.toString(),
                    categoryName = it.category.name
                )
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