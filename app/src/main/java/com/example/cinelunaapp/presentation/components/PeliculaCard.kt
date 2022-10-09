package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinelunaapp.model.Pelicula

@Composable
fun PeliculaCard(pelicula: Pelicula){
    Row(modifier = Modifier
        .padding(all = 8.dp)
        .clickable(onClick = {})
        .fillMaxWidth()
    ) {
        Column {
            Text(
                text = pelicula.nombre,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = pelicula.hora,
                modifier = Modifier.padding(all = 4.dp ),
                style = MaterialTheme.typography.subtitle2
            )
        }
    }
}