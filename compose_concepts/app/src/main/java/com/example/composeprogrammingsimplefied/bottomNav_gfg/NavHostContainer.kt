package com.example.composeprogrammingsimplefied.bottomNav_13

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = Modifier.padding(paddingValues = padding),

        builder = {
            composable("home") {
                HomeScreen()
            }
            composable("search") {
                SearchScreen()
            }
            composable("profile") {
                ProfileScreen()
            }
        })
}


@Composable
fun BottomNavigationBar(navController: NavHostController) {

    NavigationBar() {

        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route

        // Bottom nav items we declared
        Constants.BottomNavItems.forEach { navItem ->

            // Place the bottom nav items
            NavigationBarItem(
                // it currentRoute is equal then its selected route
                selected = currentRoute == navItem.route,
                // navigate on click
                onClick = {
                    navController.navigate(navItem.route)
                },
                // Icon of navItem
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },
                // label
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowBottomNavigationUI() {
    val navController = rememberNavController()

    Surface(color = Color.White) {
        // Scaffold Component
        Scaffold(
            // Bottom navigation
            bottomBar = {
                BottomNavigationBar(navController = navController)
            }, content = { padding ->
                // Navhost: where screens are placed
                NavHostContainer(navController = navController, padding = padding)
            }
        )
    }
}


@Preview(
    showBackground = true,
    name = "preview"/*,
    widthDp = 200,
    heightDp = 200*/
)
@Composable
fun showPreview() {
    ShowBottomNavigationUI()
}