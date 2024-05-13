package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import com.example.ecommerce.navigation.Pages
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.ui.commonuicomponent.ProductCard
import com.example.ecommerce.ui.theme.app_blue
import com.example.ecommerce.ui.theme.app_white
import com.example.ecommerce.viewmodel.HomeScreenVM

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavHostController?,
    viewModel: HomeScreenVM = hiltViewModel<HomeScreenVM>(),
) {


    val products by viewModel.repository.products.collectAsState()
    val categories by viewModel.repository.categories.collectAsState()
    val pagerState = rememberPagerState(pageCount = { categories.size })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(app_blue),
    ) {
        Box(modifier = Modifier.height(50.dp))
        Text(
            text = "Categories",
            fontSize = 18.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
        )

        if (categories.isNotEmpty()) MyHorizontalPager(pagerState = pagerState, items = categories)

        Box(modifier = Modifier.height(30.dp))
        Text(
            text = "Products",
            fontSize = 18.sp,
            color = app_white,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp)
        )

        if (products.isNotEmpty())
            MyLazyGrid(
                navController = navController,
                products = products
            )

    }

}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {


}