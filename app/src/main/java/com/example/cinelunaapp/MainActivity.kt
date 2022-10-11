package com.example.cinelunaapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.screens.LoginScreen
import com.example.cinelunaapp.presentation.screens.Navegacion
import com.example.cinelunaapp.ui.theme.CineLunaAppTheme

private var nombre = "Hello, World!"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CineLunaAppTheme {
                // A surface container using the 'background' color from the theme
                var name : String? = intent.getStringExtra("name");
                if (name != null) {
                    nombre= name
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navegacion(userName = name )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CineLunaAppTheme {
        LoginScreen()
    }
}