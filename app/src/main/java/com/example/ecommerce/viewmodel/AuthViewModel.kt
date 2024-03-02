package com.example.ecommerce.viewmodel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.mockdata.FakeCategories
import com.example.ecommerce.data.mockdata.TabItems
import com.example.ecommerce.data.models.category.CategoryModel

class AuthViewModel : ViewModel() {

    val email = mutableStateOf("")
    val password = mutableStateOf("")

}