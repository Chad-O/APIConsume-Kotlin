package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawerMenu(
    navController: NavController,
    userName: String?,
    onCloseDrawer : () -> Unit,
    onChangeTitle: (String)->Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .padding(
                start = 10.dp,
                end = 10.dp
            )

    ){
        Text(
            //Debe ser el nombre ingresado en login
            text = userName!!,
            modifier = Modifier
                .height(100.dp)
                .wrapContentSize(Alignment.Center),
            textAlign = TextAlign.Center
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Cartelera",
            textAlign = TextAlign.Center,
            modifier = Modifier.height(50.dp)
                .wrapContentSize(Alignment.Center)
                .clickable
            {
                //Agregar el lugar de navegacion
                navController.navigate("cartelera")
                onCloseDrawer()
                onChangeTitle("Hola ${userName}")
            }
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Sobre Nosotros",
            modifier = Modifier
                .height(50.dp)
                .wrapContentSize(Alignment.Center)
                .clickable
                {
                    //Agregar el lugar de navegacion
                    navController.navigate("somos")
                    onCloseDrawer()
                    onChangeTitle("¿Quienes Somos?")
                }
        )
    }
}