package com.example.ecommerce.ui.main_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
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
                    1 -> CartScreen()
                    2 -> UsersScreen(navController)
                    3 -> SettingsScreen(navController)
                }


            }
            TabRow(selectedTabIndex = viewModel.selectedTabIndex.intValue) {
                viewModel.tabItems.forEachIndexed { index, tabItem ->
                    Tab(selected = viewModel.selectedTabIndex.intValue == index, onClick = {
                        viewModel.changeSelectedIndex(index)
                    }, text = {
                        Text(text = tabItem.title)
                    }, icon = {
                        Icon(
                            imageVector = if (index == viewModel.selectedTabIndex.intValue) tabItem.selectedIcon
                            else tabItem.unSelectedIcon, contentDescription = tabItem.title
                        )
                    }

                    )
                }


            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(null)
}