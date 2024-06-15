package com.example.ecommerce.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerce.data.mockdata.TabItems
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.data.models.users.UserModel
import com.example.ecommerce.data.repository.EcommerceRepository
import com.example.ecommerce.ui.main_screen.home_screen.HomeScreenUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenVM @Inject constructor(private val repository: EcommerceRepository) : ViewModel() {


    val products: StateFlow<List<ProductModel>>
        get() = repository.products

    val categories: StateFlow<List<CategoryModel>>
        get() = repository.categories

    val users: StateFlow<List<UserModel>>
        get() = repository.users


    private var _uiState = MutableStateFlow(HomeScreenUIState())
    val uiState: StateFlow<HomeScreenUIState> = _uiState.asStateFlow()

    var isLoading = MutableLiveData(false)

    var selectedTabIndex = mutableIntStateOf(0)

    var tabItems = TabItems.tabs
//    var categories: List<CategoryModel> = FakeCategories.getCategories()

    init {
        viewModelScope.launch {
            repository.getAllProducts()
            repository.getAllCategories()
            repository.getAllUsers()
        }
    }

    fun changeSelectedIndex(index: Int) {
        selectedTabIndex.intValue = index
    }




}