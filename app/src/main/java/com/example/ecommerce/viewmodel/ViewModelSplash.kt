package com.example.ecommerce.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ViewModelSplash : ViewModel() {

    var backgroundColor by mutableStateOf(Color.DarkGray)
        private set


    fun changeBackgroundColor() {


        backgroundColor = Color(
            Random.nextFloat(),
            Random.nextFloat(),
            Random.nextFloat()
        )
    }


}