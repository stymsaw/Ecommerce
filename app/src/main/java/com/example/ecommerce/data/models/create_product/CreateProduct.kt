package com.example.ecommerce.data.models.create_product


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CreateProduct(
    @SerializedName("categoryId")
    val categoryId: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("images")
    val images: List<String>,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val title: String
) : Parcelable