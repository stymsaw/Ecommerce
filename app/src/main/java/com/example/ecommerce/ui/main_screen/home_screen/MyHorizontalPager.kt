package com.example.ecommerce.ui.main_screen.home_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.ui.commonuicomponent.CategoryCard


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyHorizontalPager(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    items: List<CategoryModel>,
) {

    HorizontalPager(
        state = pagerState,
        pageSize = PageSize.Fixed(200.dp),
    ) {
        val item = items[it]
        CategoryCard(categoryName = item.name, categoryImage = item.image)
    }


}


@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MyHorizontalPagerPreview() {

    val pagerState = rememberPagerState(pageCount = { 10 })

    MyHorizontalPager(
        modifier = Modifier,
        pagerState = pagerState,
        items = listOf(
            CategoryModel(id = 1, name = "name1", image = "image"),
            CategoryModel(id = 2, name = "name2", image = "image"),
            CategoryModel(id = 3, name = "name3", image = "image"),
        )
    )

}