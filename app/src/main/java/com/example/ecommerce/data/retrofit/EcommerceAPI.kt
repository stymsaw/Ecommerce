package com.example.ecommerce.data.retrofit

import com.example.ecommerce.data.models.create_product.CreateProduct
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface EcommerceAPI {


    @GET(Constants.ALL_PRODUCTS)
    suspend fun getAllProducts(): Response<List<ProductModel>>
    @GET(Constants.GET_CATEGORIES)
    suspend fun getAllCategories(): Response<List<CategoryModel>>


    @GET(Constants.ALL_PRODUCTS)
    suspend fun getFilteredProducts(
        @Query(Constants.FILTER_TITLE) title: String? = null,
        @Query(Constants.FILTER_PRICE) price: Int? = null,
        @Query(Constants.FILTER_CATEGORY) categoryId: Int? = null,
    ): Response<List<ProductModel>>


    @POST(Constants.ALL_PRODUCTS)
    suspend fun createProduct(@Body createProduct: CreateProduct) : Response<ProductModel>

}