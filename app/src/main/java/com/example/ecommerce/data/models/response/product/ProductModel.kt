package com.example.ecommerce.data.models.response.product


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.example.ecommerce.data.models.response.category.CategoryModel

@Parcelize
data class ProductModel(
    @SerializedName("category")
    val category: CategoryModel,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: List<String>,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("creationAt")
    val creationAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String
) : Parcelable