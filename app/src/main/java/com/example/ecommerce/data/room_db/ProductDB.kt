package com.example.ecommerce.data.room_db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Product::class],
    version = 1,
    exportSchema = true
)
abstract class ProductDB : RoomDatabase() {

    abstract val productsDao : ProductsDao

    companion object {
        const val DATABASE_NAME = "product"
    }

}