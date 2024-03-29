package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.ecommerce.Ecommerce
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.mockdata.FakeProducts
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.data.repository.ProductsRepository
import com.example.ecommerce.navigation.Pages
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.ui.commonuicomponent.ProductCard
import com.example.ecommerce.viewmodel.HomeScreenVM
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavHostController?,
) {

    val viewModel = hiltViewModel<HomeScreenVM>()
    val products by viewModel.repository.products.collectAsState()
    val categories by viewModel.repository.categories.collectAsState()
    val pagerState = rememberPagerState(pageCount = {
        categories.size
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

        if (categories.isNotEmpty())
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

        if (products.isNotEmpty())
            LazyVerticalGrid(
                columns = GridCells.Fixed(2)
            ) {
                itemsIndexed(products) { index, it ->
                    ProductCard(
                        title = it.title,
                        images = it.images,
                        price = it.price.toString(),
                        categoryName = it.category.name,
                        onClick = {
                            navController!!.navigate("${Pages.PRODUCT_DETAILS.name}/${index}")
                        }
                    )
                }
            }
    }

}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = null)
}