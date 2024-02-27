package com.example.ecommerce.data.repository

import com.example.ecommerce.data.api.PlatziAPI
import com.example.ecommerce.data.models.request.NewProduct
import com.example.ecommerce.data.models.response.category.CategoryModel
import com.example.ecommerce.data.models.response.product.ProductModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.Response
import javax.inject.Inject

class ProductsRepository @Inject constructor(private val platziAPI: PlatziAPI) {

    private val _products = MutableStateFlow<List<ProductModel>>(emptyList())
    private val _categories = MutableStateFlow<List<CategoryModel>>(emptyList())
    val products: StateFlow<List<ProductModel>>
        get() = _products

    val categories: StateFlow<List<CategoryModel>>
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

    suspend fun createProduct(newProduct: NewProduct): Response<ProductModel> {
        val response = platziAPI.createProduct(newProduct)
        if (response.isSuccessful && response.body() != null) {
            response.body()!!
            _products.emit(listOf(response.body()!!))
        }

        return response
    }


}