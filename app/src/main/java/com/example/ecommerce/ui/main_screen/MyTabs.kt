package com.example.ecommerce.ui.main_screen

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ecommerce.data.mockdata.TabItem
import com.example.ecommerce.data.mockdata.TabItems
import com.example.ecommerce.ui.theme.app_blue
import com.example.ecommerce.ui.theme.app_blue_light
import com.example.ecommerce.ui.theme.app_orange
import com.example.ecommerce.ui.theme.app_white


@Composable
fun MyBottomTab(
    modifier: Modifier = Modifier,
    selectedTabIndex: Int,
    tabItems: List<TabItem>,
    onTabSelected: (Int) -> Unit,
) {


    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = app_blue,
        contentColor = app_blue_light,
        modifier = modifier
            .background(app_blue)


    ) {
        tabItems.forEachIndexed { index, tabItem ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = {
                    onTabSelected(index)
                },
                text = {
                    Text(
                        text = tabItem.title,
                        color = app_white
                    )
                },
                icon = {
                    Icon(
                        imageVector =
                        if (index == selectedTabIndex) tabItem.selectedIcon
                        else tabItem.unSelectedIcon,
                        contentDescription = tabItem.title,
                        tint = app_orange,
                    )
                }

            )
        }


    }


}


@Preview
@Composable
private fun MyTabPreview() {
    MyBottomTab(
        modifier = Modifier,
        selectedTabIndex = 1,
        tabItems = TabItems.tabs,
        onTabSelected = {

        }

    )
}