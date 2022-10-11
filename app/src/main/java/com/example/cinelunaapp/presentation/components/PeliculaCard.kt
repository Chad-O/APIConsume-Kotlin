package com.example.cinelunaapp.presentation.components

import android.security.identity.AccessControlProfile
import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.Start
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.screens.PeliculaScreen

@Composable
fun PeliculaCard(pelicula: Pelicula, navigateToProfile: (Pelicula)->Unit){
    Row(modifier = Modifier
        .clickable { navigateToProfile(pelicula) }
        .fillMaxWidth()
    ) {
        //Columna que declara el divisor
        Column() {
            //Row para ordenar dos columnas una "Estrella" y otra la "pelicula"
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(start = 0.dp, top = 5.dp, end = 0.dp, bottom = 5.dp)
            ){
                //Estrella
                Column() {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Star" ,
                        modifier = Modifier.padding(start = 3.dp, top = 10.dp, end = 0.dp, bottom = 0.dp)
                            .size(40.dp)
                    )
                }
                //Pelicula
                Column() {
                    Text(
                        text = pelicula.nombre,
                        color = MaterialTheme.colors.secondaryVariant,
                        style = MaterialTheme.typography.subtitle2,
                        modifier = Modifier.padding(start = 8.dp, top = 10.dp, end = 0.dp, bottom = 0.dp),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = pelicula.hora,
                        modifier = Modifier.padding(start = 8.dp, top = 2.dp, end = 0.dp, bottom = 0.dp),
                        style = MaterialTheme.typography.subtitle2,
                        fontSize = 18.sp
                    )

                }
            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, Color.Black)
            )
        }

        //NavigationGraph(navController = navController, username ="" )
    }

}