package com.example.ecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce.ui.login_screen.LoginScreen
import com.example.ecommerce.ui.main_screen.MainScreen
import com.example.ecommerce.ui.main_screen.profile_screen.ProfileScreen
import com.example.ecommerce.ui.signup_screen.SignupScreen
import com.example.ecommerce.ui.splashscreen.SplashScreen
import com.example.ecommerce.viewmodel.AuthViewModel
import com.example.ecommerce.viewmodel.MainVM
import com.example.ecommerce.viewmodel.SplashScreenVM

enum class Pages {
    SPLASH,
    HOME,
    LOGIN,
    PROFILE_SCREEN,
    SIGNUP,
    PRODUCT_DETAILS
}

@Composable
fun EcommerceNavHost(mainVM: MainVM, navController: NavHostController) {

    val authViewModel = viewModel<AuthViewModel>()


    NavHost(
        navController = navController, startDestination = Pages.SPLASH.name,
    ) {

        composable(route = Pages.SPLASH.name) { SplashScreen(navController = navController) }
        composable(route = Pages.LOGIN.name) {
            LoginScreen(
                navController = navController,
                viewModel = authViewModel
            )
        }
        composable(route = Pages.SIGNUP.name) {
            SignupScreen(
                navController = navController,
                viewModel = authViewModel
            )
        }
        composable(route = Pages.PROFILE_SCREEN.name) { ProfileScreen(navController = navController) }
        composable(route = Pages.HOME.name) { MainScreen(navController = navController) }

    }

}

