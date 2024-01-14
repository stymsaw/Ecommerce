package com.example.ecommerce.data.api

import com.example.ecommerce.data.models.request.NewProduct
import com.example.ecommerce.data.models.response.Category
import com.example.ecommerce.data.models.response.Product
import com.example.ecommerce.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PlatziAPI {


    @GET(Constants.ALL_PRODUCTS)
    suspend fun getAllProducts(): Response<List<Product>>
    @GET(Constants.GET_CATEGORIES)
    suspend fun getAllCategories(): Response<List<Category>>


    @GET(Constants.ALL_PRODUCTS)
    suspend fun getFilteredProducts(
        @Query(Constants.FILTER_TITLE) title: String? = null,
        @Query(Constants.FILTER_PRICE) price: Int? = null,
        @Query(Constants.FILTER_CATEGORY) categoryId: Int? = null,
    ): Response<List<Product>>


    @POST(Constants.ALL_PRODUCTS)
    suspend fun createProduct(@Body newProduct: NewProduct) : Response<Product>

}