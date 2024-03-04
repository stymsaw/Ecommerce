package com.example.ecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.ecommerce.ui.login_screen.LoginScreen
import com.example.ecommerce.ui.main_screen.MainScreen
import com.example.ecommerce.ui.main_screen.settings_screen.SettingsScreen
import com.example.ecommerce.ui.product_details_screen.ProductDetailsScreen
import com.example.ecommerce.ui.signup_screen.SignupScreen
import com.example.ecommerce.ui.splashscreen.SplashScreen
import com.example.ecommerce.viewmodel.AuthViewModel

enum class Pages {
    SPLASH, HOME, LOGIN, SETTINGS_SCREEN, SIGNUP, PRODUCT_DETAILS
}

@Composable
fun EcommerceNavHost(navController: NavHostController) {

    val authViewModel = viewModel<AuthViewModel>()

    NavHost(
        navController = navController, startDestination = Pages.SPLASH.name,
    ) {

        composable(route = Pages.SPLASH.name) { SplashScreen(navController = navController) }
        composable(route = Pages.HOME.name) { MainScreen(navController = navController) }
        composable(route = Pages.SETTINGS_SCREEN.name) { SettingsScreen(navController = navController) }
        composable(route = Pages.LOGIN.name) {
            LoginScreen(
                navController = navController, viewModel = authViewModel
            )
        }
        composable(route = Pages.SIGNUP.name) {
            SignupScreen(
                navController = navController, viewModel = authViewModel
            )
        }

        composable(
            route = "${Pages.PRODUCT_DETAILS.name}/{productID}",
            arguments = listOf(navArgument(name = "productID") {
                type = NavType.StringType
            })
        ) {
            val productID = it.arguments?.getString("productID") ?: ""
            ProductDetailsScreen(
                navController = navController,
                productID = productID.toInt()
            )
        }

    }

}

