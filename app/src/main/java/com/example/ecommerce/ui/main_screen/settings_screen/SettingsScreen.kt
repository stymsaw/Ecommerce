package com.example.ecommerce.ui.main_screen.settings_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ecommerce.R
import com.example.ecommerce.navigation.Pages
import com.example.ecommerce.ui.theme.app_blue
import com.example.ecommerce.ui.theme.app_white

@Composable
fun SettingsScreen(navController: NavHostController?) {

    Column(
        modifier = Modifier
            .background(app_blue)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, shape = CircleShape)
            )
            Box(Modifier.width(20.dp))

            Text(
                text = "Satya Saw",
                fontSize = 28.sp,
                color = app_white
            )

        }
        Text(
            text = "Login",
            fontSize = 24.sp,
            color = app_white,
            modifier = Modifier.clickable {
                navController?.navigate(Pages.LOGIN.name)
            }
        )
        Text(
            text = "Sign up",
            fontSize = 24.sp,
            color = app_white,
            modifier = Modifier.clickable {
                navController?.navigate(Pages.SIGNUP.name)
            }
        )
        Text(
            text = "Settings",
            fontSize = 24.sp,
            color = app_white,
            modifier = Modifier.clickable { })
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun SettingsScreenPreview() {

    SettingsScreen(null)

}