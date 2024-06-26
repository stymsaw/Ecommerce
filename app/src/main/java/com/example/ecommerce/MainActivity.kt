package com.example.ecommerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce.navigation.EcommerceNavHost
import com.example.ecommerce.ui.theme.EcommerceTheme
import com.example.ecommerce.viewmodel.MainVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainVM = ViewModelProvider(this)[MainVM::class.java]

        setContent {
            val navController = rememberNavController()
            EcommerceTheme {
                Surface(
                    Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EcommerceNavHost(navController)
                }
            }
        }
    }
}


