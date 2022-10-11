package com.example.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.components.*
import com.example.cinelunaapp.ui.theme.CineLunaAppTheme
import kotlinx.coroutines.launch


@Composable
fun PeliculaScreen(
    peliculaData: Pelicula,
){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        DetallePelicula(peliculaData)
    }
}
