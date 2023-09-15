package com.example.composeprogrammingsimplefied.PS_viewPager

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeprogrammingsimplefied.bottomNav_13.ShowBottomNavigationUI
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun OnBoardingScreen() {
    val pageState = rememberPagerState()

    Column {
        HorizontalPager(
            count = pageItemList.size,
            state = pageState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
            ) { page ->
            PageUi(pageItem = pageItemList[page])
        }
        HorizontalPagerIndicator(pagerState = pageState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            activeColor = Color.DarkGray
        )
        AnimatedVisibility(visible = pageState.currentPage == 2) {
            Column(verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .sizeIn(maxHeight = 40.dp)) {
                Button(onClick = {}, modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Green)
                ) {
                    Text(text = "Getting Started")
                }
            }
        }
    }
}

@Composable
fun PageUi(pageItem: PageItem) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = pageItem.image),
            contentDescription = pageItem.des,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = pageItem.des)
    }
}

@Preview(
    showBackground = true,
    name = "preview"/*,
    widthDp = 200,
    heightDp = 200*/
)
@Composable
fun ShowPreview() {
    OnBoardingScreen()
}