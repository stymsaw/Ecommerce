package com.example.ecommerce.data.repository

import com.example.ecommerce.data.retrofit.EcommerceAPI
import com.example.ecommerce.data.models.create_product.CreateProduct
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.create_category.CreateCategoryModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.data.models.users.CreateUserModel
import com.example.ecommerce.data.models.users.UserModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.Response
import javax.inject.Inject

class ProductsRepository @Inject constructor(private val ecommerceAPI: EcommerceAPI) {

    private val _products = MutableStateFlow<List<ProductModel>>(emptyList())
    private val _singleProducts = MutableStateFlow<ProductModel?>(null)

    private val _categories = MutableStateFlow<List<CategoryModel>>(emptyList())
    private val _singleCategory = MutableStateFlow<CategoryModel?>(null)

    private val _users = MutableStateFlow<List<UserModel>>(emptyList())
    private val _singleUser = MutableStateFlow<UserModel?>(null)

    val products: StateFlow<List<ProductModel>>
        get() = _products

    val singleProduct: StateFlow<ProductModel?>
        get() = _singleProducts

    val categories: StateFlow<List<CategoryModel>>
        get() = _categories
    val singleCategory: StateFlow<CategoryModel?>
        get() = _singleCategory

    val users: StateFlow<List<UserModel>>
        get() = _users
    val user: StateFlow<UserModel?>
        get() = _singleUser


    suspend fun getAllProducts() {
        val response = ecommerceAPI.getAllProducts()
        if (response.isSuccessful && response.body() != null) _products.emit(response.body()!!)
    }

    suspend fun getProductByID(id: String) {
        val response = ecommerceAPI.getProductByID(id)
        if (response.isSuccessful && response.body() != null) _singleProducts.emit(response.body()!!)
    }


    suspend fun getAllCategories() {
        val response = ecommerceAPI.getAllCategories()
        if (response.isSuccessful && response.body() != null) _categories.emit(response.body()!!)
    }

    suspend fun getCategoryByID(id: String) {
        val response = ecommerceAPI.getCategoryByID(id)
        if (response.isSuccessful && response.body() != null) _singleCategory.emit(response.body()!!)
    }

    suspend fun getAllUsers() {
        val response = ecommerceAPI.getAllUsers()
        if (response.isSuccessful && response.body() != null) _users.emit(response.body()!!)
    }

    suspend fun getUserByID(id: String) {
        val response = ecommerceAPI.getUserByID(id)
        if (response.isSuccessful && response.body() != null) _singleUser.emit(response.body()!!)
    }

    suspend fun getFilteredProducts(
        title: String? = null,
        price: Int? = null,
        categoryId: Int? = null,
    ) {
        val response = ecommerceAPI.getFilteredProducts(
            title = title,
            price = price,
            categoryId = categoryId,
        )
        if (response.isSuccessful && response.body() != null) _products.emit(response.body()!!)
    }

    suspend fun createProduct(createProduct: CreateProduct): Response<ProductModel> {
        val response = ecommerceAPI.createProduct(createProduct)
        if (response.isSuccessful && response.body() != null) {
            response.body()!!
            _products.emit(listOf(response.body()!!))
        }
        return response
    }

    suspend fun createCategory(createCategory: CreateCategoryModel) {
        val response = ecommerceAPI.createCategory(createCategory)
        if (response.isSuccessful && response.body() != null) {
            _singleCategory.emit(response.body()!!)
        }
    }

    suspend fun createUsers(user: CreateUserModel) {
        val response = ecommerceAPI.createUser(user)
        if (response.isSuccessful && response.body() != null) {
            _singleUser.emit(response.body()!!)
        }
    }


}