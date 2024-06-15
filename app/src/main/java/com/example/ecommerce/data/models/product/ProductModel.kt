package com.example.ecommerce.data.models.product


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.example.ecommerce.data.models.category.CategoryModel

@Parcelize
data class ProductModel(
    @SerializedName("category")
    val category: CategoryModel = CategoryModel(id = 1, name = "shirt", image = ""),
    @SerializedName("description")
    val description: String = "",
    @SerializedName("id")
    val id: Int = 1,
    @SerializedName("images")
    val images: List<String> = listOf("demo 1", "demo 2"),
    @SerializedName("price")
    val price: Long = 1230,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("creationAt")
    val creationAt: String = "",
    @SerializedName("updatedAt")
    val updatedAt: String = "",
) : Parcelable