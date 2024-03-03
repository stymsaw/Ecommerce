package com.example.ecommerce.ui.product_details_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.mockdata.TabItems
import com.example.ecommerce.data.models.category.CategoryModel

class ProductDetailsVM : ViewModel() {

    var selectedTabIndex = mutableIntStateOf(0)
        private set

    var tabItems = TabItems.tabs


    var categories: List<CategoryModel> = FakeCategories.getCategories()

    fun changeSelectedIndex(index: Int) {
        selectedTabIndex.intValue = index
    }

}