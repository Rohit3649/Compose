package com.example.composeprogrammingsimplefied.voyagerNavigation.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.core.screen.Screen

data class ThirdScreen(
   val name: String
) : Screen {
    @Composable
    override fun Content() {
        Text(text = "Third Screen")
        Text(text = "Welcome $name", textAlign = TextAlign.Center)
    }

}