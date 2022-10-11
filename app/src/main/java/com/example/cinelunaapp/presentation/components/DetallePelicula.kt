package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula

@Composable
fun DetallePelicula(
    peliculaData: Pelicula
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = peliculaData.nombre,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp),
            fontSize = 25.sp)
        Column() {
            Text(
                modifier = Modifier
                    .padding(6.dp)
                    .padding(start = 0.dp, top = 1.dp, end = 0.dp, bottom = 5.dp),
                text = peliculaData.resena,
                fontSize = 15.sp,
                textAlign = TextAlign.Justify
            )
            Text(
                modifier = Modifier
                    .padding(6.dp)
                    .padding(start = 0.dp, top = 2.dp, end = 0.dp, bottom = 5.dp),
                text = "Hora: "+ peliculaData.hora,
                fontSize = 20.sp,
                textAlign = TextAlign.End
            )
        }

        //Implementar- Button_regresar
        Button(onClick = {} ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(7.dp)
        ){
            Text(text = "Regresar")
        }
    }
}