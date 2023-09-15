package com.example.composeprogrammingsimplefied.PS_voyagerNavigation_12.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.example.composeprogrammingsimplefied.PS_viewPager.OnBoardingScreen
import com.example.composeprogrammingsimplefied.voyagerNavigation.screens.FirstScreen

@Composable
fun NavigatorScreen() {
    Navigator(screen = FirstScreen)
}


@Preview(
    showBackground = true,
    name = "preview"/*,
    widthDp = 200,
    heightDp = 200*/
)
@Composable
fun ShowPreview() {
    NavigatorScreen()
}