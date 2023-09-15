package com.example.composeprogrammingsimplefied.voyagerNavigation.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

object SecondScreen : Screen {
    @Composable
    override fun Content() {
        Text(text = "Second Screen")
    }

}