package com.example.ecommerce.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.mockdata.TabItems

class HomeScreenVM : ViewModel() {

    var selectedTabIndex = mutableIntStateOf(0)
        private set

    var tabItems = TabItems.tabs

    fun changeSelectedIndex(index: Int) {
        selectedTabIndex.intValue = index
    }

}