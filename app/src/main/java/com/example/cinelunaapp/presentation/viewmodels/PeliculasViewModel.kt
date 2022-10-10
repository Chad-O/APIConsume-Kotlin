package com.example.cinelunaapp.presentation.viewmodels

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.lifecycle.ViewModel
import com.example.cinelunaapp.model.GestorPeliculas
import com.example.cinelunaapp.model.Pelicula


class PeliculasViewModel : ViewModel() {
    val listaPeliculas = mutableListOf<Pelicula>()
    fun obtenerPeliculas() : Unit {
        GestorPeliculas.obtenerInstancia().obtenerPeliculas().forEach{
            listaPeliculas.add(it);
        }
    }
}