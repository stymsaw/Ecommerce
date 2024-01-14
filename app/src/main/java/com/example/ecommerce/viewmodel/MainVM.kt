package com.example.ecommerce.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.models.response.Product
import com.example.ecommerce.data.repository.ProductsRepository
import androidx.lifecycle.viewModelScope
import com.example.ecommerce.data.models.request.NewProduct
import com.example.ecommerce.data.models.response.Category
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(private val repository: ProductsRepository) : ViewModel() {

    val products: StateFlow<List<Product>>
        get() = repository.products

    val categories: StateFlow<List<Category>>
        get() = repository.categories


    init {

        viewModelScope.launch {
            val response = repository.createProduct(
                NewProduct(
                    categoryId = 1,
                    description = "description not required",
                    images = listOf("img1","img2"),
                    price = 29,
                    title = "title not required"
                )
            )


        }


    }


}


