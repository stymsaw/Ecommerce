package com.example.ecommerce.ui.product_details_screen

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
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
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.ecommerce.R
import com.example.ecommerce.data.mockdata.FakeProducts
import com.example.ecommerce.data.models.product.ProductModel
import com.example.ecommerce.ui.commonuicomponent.CategoryCard
import com.example.ecommerce.ui.theme.app_blue
import com.example.ecommerce.ui.theme.app_blue_light
import com.example.ecommerce.ui.theme.app_white
import com.example.ecommerce.viewmodel.HomeScreenVM
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ProductDetailsScreen(
    navController: NavHostController?,
    productID: Int,
) {

    val viewModel: ProductDetailsVM = viewModel<ProductDetailsVM>()
    val product: ProductModel = FakeProducts.getProducts()[productID]
    val pagerState = rememberPagerState(pageCount = {
        product.images.size
    })

    LaunchedEffect(key1 = pagerState.currentPage) {
        launch {
            delay(3000)
            with(pagerState) {
                val idx = (this.currentPage + 1) % this.pageCount
                scrollToPage(idx)
            }
        }
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(app_blue_light)
            .padding()

    ) {


        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = app_blue,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text(
                    "Product Details Screen",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = app_white,
                )
            },
            navigationIcon = {
                Icon(imageVector = Icons.Filled.ArrowBackIosNew,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable { navController?.popBackStack() })
            },
        )

        val inputModifier = Modifier
            .fillMaxWidth(0.85f)
            .padding(bottom = 20.dp)

        HorizontalPager(
            state = pagerState, modifier = Modifier.padding(bottom = 20.dp)
        ) {
            AsyncImage(
                model = product.images[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(280.dp)
                    .clip(RectangleShape)
                    .border(2.dp, Color.Gray, shape = RectangleShape)
            )
        }

        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 8.dp), horizontalArrangement = Arrangement.Center
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color = if (pagerState.currentPage == iteration) Color.Green else Color.White
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(10.dp)
                )
            }
        }


        AsyncImage(
            model = product.category.image,
            placeholder = painterResource(id = R.drawable.img_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, shape = CircleShape)

        )

        Box(Modifier.height(5.dp))

        Text(
            text = product.title,
            maxLines = 1,
            color = app_white,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.labelLarge // Apply a subtitle style
        )
        Box(Modifier.height(5.dp))
        Text(
            text = "Price: $${product.price}",
            maxLines = 1,
            color = app_white,
            overflow = TextOverflow.Ellipsis
        )
        Box(Modifier.height(5.dp))
        Text(
            text = "Category: ${product.category.name}",
            maxLines = 1,
            color = app_white,
            overflow = TextOverflow.Ellipsis
        )
        Box(Modifier.height(5.dp))
        Text(
            text = "Description: ${product.description}",
            color = app_white,
        )
        Box(Modifier.height(5.dp))


    }
}


@Preview(showBackground = true)
@Composable
fun ProductDetailsScreenPreview() {

    ProductDetailsScreen(productID = 0, navController = null)
}