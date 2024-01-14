package com.example.ecommerce.data.repository

import com.example.ecommerce.data.api.PlatziAPI
import com.example.ecommerce.data.models.request.NewProduct
import com.example.ecommerce.data.models.response.Category
import com.example.ecommerce.data.models.response.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.Response
import javax.inject.Inject

class ProductsRepository @Inject constructor(private val platziAPI: PlatziAPI) {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    private val _categories = MutableStateFlow<List<Category>>(emptyList())
    val products: StateFlow<List<Product>>
        get() = _products

    val categories: StateFlow<List<Category>>
        get() = _categories


    suspend fun getAllProducts() {
        val response = platziAPI.getAllProducts()
        if (response.isSuccessful && response.body() != null)
            _products.emit(response.body()!!)
    }

    suspend fun getAllCategories() {
        val response = platziAPI.getAllCategories()
        if (response.isSuccessful && response.body() != null)
            _categories.emit(response.body()!!)
    }

    suspend fun getFilteredProducts(
        title: String? = null,
        price: Int? = null,
        categoryId: Int? = null,
    ) {
        val response =
            platziAPI.getFilteredProducts(title = title, price = price, categoryId = categoryId)
        if (response.isSuccessful && response.body() != null)
            _products.emit(response.body()!!)

    }

    suspend fun createProduct(newProduct: NewProduct): Response<Product> {
        val response = platziAPI.createProduct(newProduct)
        if (response.isSuccessful && response.body() != null) {
            response.body()!!
            _products.emit(listOf(response.body()!!))
        }

        return response
    }


}