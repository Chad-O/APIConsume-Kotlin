package com.example.cinelunaapp.Components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun Header(){
    Text(
        text = LocalContext.current.getString(
            "placeholder -> Debe ser el titulo de la pantalla activa"
        )
    )
}