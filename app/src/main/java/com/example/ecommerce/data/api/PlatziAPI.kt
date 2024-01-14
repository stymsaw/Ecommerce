package com.example.ecommerce.data.api

import com.example.ecommerce.data.models.Product
import com.example.ecommerce.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface PlatziAPI {


    @GET(Constants.ALL_PRODUCTS)
    suspend fun getAllProducts(): Response<List<Product>>


}