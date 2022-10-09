package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinelunaapp.model.Pelicula

@Composable
fun DetallePelicula(
    peliculaData: Pelicula
){
    Card(
        elevation = 4.dp
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp),
        ) {
            Text(
                text = peliculaData.nombre,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Text(
                text = peliculaData.resena,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Center)
            )
            Text(
                text = peliculaData.hora,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}