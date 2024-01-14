package com.example.ecommerce.ui.splashscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.ecommerce.R
import com.example.ecommerce.viewmodel.SplashScreenVM
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController? = null) {
    val viewModel = viewModel<SplashScreenVM>()
    LaunchedEffect(true) {

        delay(3000)
        navController?.navigate("home")

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(viewModel.backgroundColor)
            .padding(top = 50.dp)
    ) {
        AnimatedPreloader(
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        ElevatedButton(
            onClick = { viewModel.changeBackgroundColor() },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        ) {
            Text(
                text = "change background",
            )
        }


    }
}

@Composable
fun AnimatedPreloader(modifier: Modifier = Modifier) {
    val preloaderLottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.animation_preloader
        )
    )

    val preloaderProgress by animateLottieCompositionAsState(
        preloaderLottieComposition,
        iterations = LottieConstants.IterateForever,
        isPlaying = true
    )


    LottieAnimation(
        composition = preloaderLottieComposition,
        progress = { preloaderProgress },
        modifier = modifier
    )

}

@Preview
@Composable
fun PreviewSplash() {
    SplashScreen()
}
