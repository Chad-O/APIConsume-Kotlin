package com.example.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.components.DrawerMenu
import com.example.cinelunaapp.presentation.components.NavigationGraph
import com.example.cinelunaapp.presentation.components.PeliculaLista
import com.example.cinelunaapp.presentation.components.TopBar
import com.example.cinelunaapp.presentation.viewmodels.PeliculasViewModel
import kotlinx.coroutines.launch
import com.example.cinelunaapp.presentation.components.NavigationGraph
@Composable
fun CarteleraScreen(userName : String, navController : NavHostController) {
    var viewModelPeli = PeliculasViewModel();
    viewModelPeli.obtenerPeliculas();
    Column{
        PeliculaLista(peliculas = viewModelPeli.listaPeliculas, navController)
    }
}