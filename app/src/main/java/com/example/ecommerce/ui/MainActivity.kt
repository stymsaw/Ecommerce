package com.example.ecommerce.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.ecommerce.navigation.EcommerceNavHost
import com.example.ecommerce.ui.theme.EcommerceTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var analytics: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            EcommerceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EcommerceNavHost()
//                    testing new commit
                }
            }
        }
    }
}


