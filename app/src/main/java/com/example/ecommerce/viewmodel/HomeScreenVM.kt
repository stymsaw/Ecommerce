package com.example.ecommerce.viewmodel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerce.Ecommerce
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.mockdata.TabItems
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.users.UserModel
import com.example.ecommerce.data.repository.ProductsRepository
import com.example.ecommerce.data.retrofit.EcommerceAPI
import kotlinx.coroutines.launch

class HomeScreenVM : ViewModel() {

    var users: MutableState<List<UserModel>> = mutableStateOf(emptyList())
    private var _isLoading = mutableStateOf(true)
    var isLoading: State<Boolean> = _isLoading

    var selectedTabIndex = mutableIntStateOf(0)
        private set

    var tabItems = TabItems.tabs


    var categories: List<CategoryModel> = FakeCategories.getCategories()

    fun changeSelectedIndex(index: Int) {
        selectedTabIndex.intValue = index
    }

    fun getAllUsers() {
        _isLoading.value = true
        viewModelScope.launch {
            val response = Ecommerce.retrofit.getAllUsers()
            if (response.isSuccessful && response.body() != null) {
                users.value = response.body()!!
            }
            _isLoading.value = false
        }
    }

}