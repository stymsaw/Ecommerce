package com.example.ecommerce.ui.homescreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ecommerce.viewmodel.ViewModelHome

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val viewModel = viewModel<ViewModelHome>()
    val pagerState = rememberPagerState {
        viewModel.tabItems.size
    }

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
                state = pagerState,

                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) { index ->

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center

                ) {

                    Text(text = viewModel.tabItems[index].title)
                }

            }
            TabRow(selectedTabIndex = viewModel.selectedTabIndex.intValue) {

                viewModel.tabItems.forEachIndexed { index, tabItem ->
                    Tab(
                        selected = viewModel.selectedTabIndex.intValue == index,
                        onClick = {
                            viewModel.changeSelectedIndex(index)
                        },
                        text = {
                            Text(text = tabItem.title)
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == viewModel.selectedTabIndex.intValue) tabItem.selectedIcon
                                else tabItem.unSelectedIcon,
                                contentDescription = tabItem.title
                            )
                        }

                    )
                }


            }
        }
    }

}