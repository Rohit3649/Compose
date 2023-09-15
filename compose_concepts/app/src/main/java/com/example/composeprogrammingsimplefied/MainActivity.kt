package com.example.composeprogrammingsimplefied

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.example.composeprogrammingsimplefied.PS_viewPager.OnBoardingScreen
import com.example.composeprogrammingsimplefied.ui.theme.ComposeProgrammingSimplefiedTheme
import com.example.composeprogrammingsimplefied.voyagerNavigation.screens.FirstScreen

//Programming Simplified - PS
//Cheezy Code - CC
//geeksforgeeks - GFG

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeProgrammingSimplefiedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Navigator(screen = FirstScreen) // #12
                    //Navigator()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    name = "preview"/*,
    widthDp = 200,
    heightDp = 200*/
)
@Composable
fun ShowPreview() {
    Greeting("Android")
}