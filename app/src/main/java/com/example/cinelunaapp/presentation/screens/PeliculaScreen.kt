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
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.components.*
import com.example.cinelunaapp.presentation.viewmodels.PeliculasViewModel
import com.example.cinelunaapp.ui.theme.CineLunaAppTheme
import kotlinx.coroutines.launch
import kotlin.math.log


@Composable
fun PeliculaScreen(
    navController : NavHostController,
    index : String
){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val viewmodel  = PeliculasViewModel()
        viewmodel.obtenerPeliculas();
        val indice = index.toInt()
        val peliculas = viewmodel.listaPeliculas
        val peliculaData = peliculas.get(indice)
        println(index)
        DetallePelicula(peliculaData , navController)
    }
}
