package com.example.ecommerce.data.models.create_category


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CreateCategoryModel(
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String
) : Parcelable