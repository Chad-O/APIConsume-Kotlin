package com.example.cinelunaapp.presentation.components

import android.content.res.Resources
import android.security.identity.AccessControlProfile
import com.example.cinelunaapp.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.GestorPeliculas
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.screens.PeliculaScreen

@Composable
fun PeliculaCard(pelicula: Pelicula, navController: NavHostController){
    var peliculas = GestorPeliculas.obtenerInstancia().obtenerPeliculas();
    var indice = peliculas.indexOf(pelicula);
    println(peliculas.indexOf(pelicula))
    Row(modifier = Modifier
        .padding(all = 8.dp)
        .clickable { navController.navigate("pelicula/${indice}")}
        .fillMaxWidth()
        .border(width = 10.dp)
    ) {
        Image(painterResource(
            R.drawable.estrella_negra) ,
            contentDescription = "estrella" ,
            Modifier
                .size(80.dp))
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