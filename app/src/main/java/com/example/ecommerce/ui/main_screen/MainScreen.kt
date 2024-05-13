package com.example.ecommerce.ui.main_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ecommerce.ui.main_screen.cart_screen.CartScreen
import com.example.ecommerce.ui.main_screen.users_screen.UsersScreen
import com.example.ecommerce.ui.main_screen.home_screen.HomeScreen
import com.example.ecommerce.ui.main_screen.settings_screen.SettingsScreen
import com.example.ecommerce.viewmodel.HomeScreenVM


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen(navController: NavHostController?) {

    val viewModel = hiltViewModel<HomeScreenVM>()
    val pagerState = rememberPagerState { 4 }

    LaunchedEffect(viewModel.selectedTabIndex.intValue) {
        pagerState.animateScrollToPage(viewModel.selectedTabIndex.intValue)
    }

    LaunchedEffect(pagerState.currentPage) {
        viewModel.changeSelectedIndex(pagerState.targetPage)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            HorizontalPager(
                state = pagerState, modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) { index ->
                when (index) {
                    0 -> HomeScreen(navController)
                    1 -> UsersScreen(navController)
                    2 -> SettingsScreen(navController)
                }
//                    1 -> CartScreen()


            }

            MyBottomTab(
                selectedTabIndex = viewModel.selectedTabIndex.intValue,
                tabItems = viewModel.tabItems
            ) {
                viewModel.changeSelectedIndex(it)
            }

        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(null)
}