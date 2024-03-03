package com.example.ecommerce.data.room_db


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.ecommerce.data.models.category.CategoryModel

@Entity
data class Product(
    @PrimaryKey
    val price: Int,
    val description: String,
    val id: Int,
    val title: String,
    val creationAt: String,
    val updatedAt: String
)

