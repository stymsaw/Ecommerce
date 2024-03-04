package com.example.ecommerce

import android.app.Application
import com.example.ecommerce.data.retrofit.EcommerceAPI
import com.example.ecommerce.utils.Constants
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltAndroidApp
class Ecommerce : Application() {


    companion object {

        val retrofit: EcommerceAPI = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EcommerceAPI::class.java)

    }


}