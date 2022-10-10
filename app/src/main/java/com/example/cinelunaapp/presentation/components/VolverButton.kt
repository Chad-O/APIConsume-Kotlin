package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.presentation.components.NavigationGraph


//Reinicia la aplicación XD funciona como un logout.
@Composable
fun BotonVolver(
    navController: NavHostController
){
    Button(onClick = { navController.popBackStack() } ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Text(text = "Regresar")
    }
}