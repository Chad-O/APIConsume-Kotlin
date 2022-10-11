package com.example.cinelunaapp.presentation.components

import android.security.identity.AccessControlProfile
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.screens.PeliculaScreen

@Composable
fun PeliculaCard(pelicula: Pelicula, navigateToProfile: (Pelicula)->Unit){
    Row(modifier = Modifier
        .padding(all = 8.dp)
        .clickable{navigateToProfile(pelicula)}
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
        //NavigationGraph(navController = navController, username ="" )
    }

}