package com.example.ecommerce.data.room_db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.ecommerce.data.models.product.ProductModel

@Dao
interface ProductsDao {
    @Query("DELETE FROM product")
    suspend fun deleteAllProducts()

    @Delete
    suspend fun deleteProduct(productModel: Product)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addProduct(productModel: Product)

    @Update
    suspend fun updateProduct(productModel: Product)

    @Query("SELECT * from product ORDER BY id ASC")
    fun getProducts(): LiveData<List<Product>>

}


