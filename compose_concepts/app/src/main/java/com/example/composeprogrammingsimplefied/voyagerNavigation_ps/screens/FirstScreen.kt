package com.example.composeprogrammingsimplefied.voyagerNavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object FirstScreen : Screen{

    @Composable
    override fun Content() {
        var navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                navigator.push(ThirdScreen("rohit"))
                // because push is infix function
                //navigator push SecondScreen
                //navigator += SecondScreen
            }) {
                Text(text = "First Screen")
            }
        }
    }
}