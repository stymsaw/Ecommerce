package com.example.ecommerce.ui.login_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ecommerce.viewmodel.AuthViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    viewModel: AuthViewModel?, navController: NavHostController?
) {

    Scaffold(
        topBar = {
            TopAppBar(colors = topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ), title = {
                Text(
                    "Login Screen",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }, navigationIcon = {
                Icon(imageVector = Icons.Filled.ArrowBackIosNew,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable { navController?.popBackStack() })
            })
        },
    ) { it ->


        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            val inputModifier = Modifier
                .fillMaxWidth(0.85f)
                .padding(bottom = 20.dp)



            OutlinedTextField(
                modifier = inputModifier,
                value = viewModel?.email?.value ?: "",
                placeholder = { Text("Enter email") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                onValueChange = { viewModel!!.email.value = it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email, contentDescription = "email icon"
                    )
                },
            )
            OutlinedTextField(
                modifier = inputModifier,
                value = viewModel?.password?.value ?: "",
                placeholder = { Text("Enter password") },
                onValueChange = { viewModel!!.email.value = it },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock, contentDescription = "password icon"
                    )
                },
            )
            Box(Modifier.height(20.dp))
            FloatingActionButton(modifier = Modifier.width(100.dp), onClick = { }) {
                Text(text = "Login", fontSize = 18.sp)
            }


        }
    }

}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        viewModel = null, navController = null
    )
}