package com.example.composeprogrammingsimplefied.toolbar

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.composeprogrammingsimplefied.Greeting

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBar() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title =  { Text(text = "My Title") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                    Icon(Icons.Default.Menu, contentDescription = "")
                }},
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Notifications, contentDescription = "")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, contentDescription = "")
                    }
                })
                 },
        floatingActionButton = {
            IconButton(onClick = {}) {
                Icon(Icons.Default.Add, contentDescription = "")
            }
        }
    ) {
        Text(text = "Rohit Kumar")
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
    ToolBar()
}