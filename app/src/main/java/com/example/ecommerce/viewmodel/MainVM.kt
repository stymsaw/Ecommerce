package com.example.ecommerce.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.models.Product
import com.example.ecommerce.data.repository.ProductsRepository
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(private val repository: ProductsRepository) : ViewModel() {

    val products: StateFlow<List<Product>>
        get() = repository.products


    init {

        viewModelScope.launch {
            repository.getAllProducts()
        }

    }


}


