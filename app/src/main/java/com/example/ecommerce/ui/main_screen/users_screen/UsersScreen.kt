package com.example.ecommerce.ui.main_screen.users_screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.ecommerce.ui.commonuicomponent.UserItem
import com.example.ecommerce.ui.theme.app_blue
import com.example.ecommerce.viewmodel.HomeScreenVM

@Composable
fun UsersScreen(
    navController: NavHostController?,
    users: List<String> = listOf("", "", "", "", "", "", "", "", "", "", "", ""),
    viewModel: HomeScreenVM = hiltViewModel<HomeScreenVM>(),
) {
    val userList by viewModel.users.collectAsState()


    Column(
        modifier = Modifier.background(app_blue), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier.height(20.dp))

        if (userList.isEmpty()) LinearProgressIndicator()
        else LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(userList) { _, it ->
                UserItem(image = it.avatar)
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun UsersScreenPreview() {

    UsersScreen(
        navController = null
    )


}