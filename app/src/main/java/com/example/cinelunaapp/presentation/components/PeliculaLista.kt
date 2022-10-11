package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.cinelunaapp.model.Pelicula

@Composable
fun PeliculaLista(peliculas: List<Pelicula>, navigateToProfile: (Pelicula)-> Unit){
    LazyColumn{
        items(peliculas){
            pelicula -> PeliculaCard(pelicula = pelicula, navigateToProfile)
        }
    }
}