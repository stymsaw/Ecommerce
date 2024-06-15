package com.example.ecommerce.data.retrofit

import com.example.ecommerce.data.models.create_product.CreateProduct
import com.example.ecommerce.data.models.category.CategoryModel
import com.example.ecommerce.data.models.create_category.CreateCategoryModel
import com.example.ecommerce.data.models.file_upload.UploadedFileModel
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.data.models.users.CreateUserModel
import com.example.ecommerce.data.models.users.UserModel
import com.example.ecommerce.utils.Constants
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface EcommerceAPI  {

    //    product end-points
    @GET(Constants.PRODUCTS)
    suspend fun getAllProducts(): Response<List<ProductModel>>

    @GET("${Constants.PRODUCTS}/{id}")
    suspend fun getProductByID(@Path("id") id: String): Response<ProductModel>

    @GET(Constants.PRODUCTS)
    suspend fun getFilteredProducts(
        @Query(Constants.FILTER_TITLE) title: String? = null,
        @Query(Constants.FILTER_PRICE) price: Int? = null,
        @Query(Constants.FILTER_CATEGORY) categoryId: Int? = null,
    ): Response<List<ProductModel>>

    //    category end-points
    @GET(Constants.CATEGORIES)
    suspend fun getAllCategories(): Response<List<CategoryModel>>

    @GET("${Constants.CATEGORIES}/{id")
    suspend fun getCategoryByID(@Path("id") id: String): Response<CategoryModel>

    //    user end-points
    @GET(Constants.USERS)
    suspend fun getAllUsers(): Response<List<UserModel>>

    @GET("${Constants.USERS}/{id")
    suspend fun getUserByID(@Path("id") id: String): Response<UserModel>

    @POST(Constants.PRODUCTS)
    suspend fun createProduct(@Body createProduct: CreateProduct): Response<ProductModel>

    @POST(Constants.CATEGORIES)
    suspend fun createCategory(@Body createCategory: CreateCategoryModel): Response<CategoryModel>

    @POST(Constants.USERS)
    suspend fun createUser(@Body user: CreateUserModel): Response<UserModel>

    //    upload image on the server
    @Multipart
    @POST(Constants.PRODUCTS)
    suspend fun uploadFile(@Part partFile: MultipartBody.Part): Response<UploadedFileModel>


}