package com.example.ecommerce.data.repository

import com.example.ecommerce.data.api.PlatziAPI
import com.example.ecommerce.data.models.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class ProductsRepository @Inject constructor(private val platziAPI: PlatziAPI) {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>>
        get() = _products

    suspend fun getAllProducts() {
        val response = platziAPI.getAllProducts()
        if (response.isSuccessful && response.body() != null)
            _products.emit(response.body()!!)
    }

}