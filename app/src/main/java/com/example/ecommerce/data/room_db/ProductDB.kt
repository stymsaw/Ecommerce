package com.example.ecommerce.data.room_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [Product::class], version = 1, exportSchema = false
)
abstract class ProductDB : RoomDatabase() {

    abstract val productsDao: ProductsDao

    companion object {
        @Volatile
        private var INSTANCE: ProductDB? = null

        private const val DATABASE_NAME = "product"

        fun getDatabase(context: Context): ProductDB {
            if (INSTANCE == null) {

                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext, ProductDB::class.java, DATABASE_NAME
                    ).build()
                }

            }

            return INSTANCE!!
        }
    }

}