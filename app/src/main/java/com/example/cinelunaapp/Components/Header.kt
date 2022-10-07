package com.example.cinelunaapp.Components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import app.src.main.java.com.example.cinelunaapp.R

@Composable
fun Header(){
    Text(
        text = LocalContext.current.getString(
            R.string.pelicula_lista_titulo
        )
    )
}