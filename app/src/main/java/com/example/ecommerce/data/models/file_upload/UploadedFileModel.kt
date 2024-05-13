package com.example.ecommerce.data.models.file_upload


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.example.ecommerce.data.models.category.CategoryModel

@Parcelize
data class UploadedFileModel(
    @SerializedName("originalname")
    val originalName: String,
    @SerializedName("filename")
    val fileName: String,
    @SerializedName("location")
    val location: String,
) : Parcelable