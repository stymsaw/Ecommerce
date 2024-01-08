package com.example.ecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce.ui.homescreen.HomeScreen
import com.example.ecommerce.ui.splashscreen.SplashScreen

@Composable
fun EcommerceNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {

        composable(route = "splash") {
            SplashScreen(navController = navController)
        }

        composable(route = "home") {
            HomeScreen()
        }

    }

}

