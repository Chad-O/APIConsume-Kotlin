package com.example.cinelunaapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview fun DrawerMenu(
    navController: NavController,
    onCloseDrawer : () -> Unit,
    onChangeTitle: (String)->Unit
){
    Column(
        modifier=Modifier.fillMaxSize().padding(
            start = 24.dp,
            end = 24.dp
        )
    ){
        Text(
            //Debe ser el nombre ingresado en login
            text = "Placeholder"
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Cartelera",
            modifier = Modifier.height(23.dp).clickable
            {
                //Agregar el lugar de navegacion
                navController.navigate("cartelera")
                onCloseDrawer()
                onChangeTitle("Cartelera")
            }
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Sobre Nostros",
            modifier = Modifier.height(23.dp).clickable
            {
                //Agregar el lugar de navegacion
                navController.navigate("somos")
                onCloseDrawer()
                onChangeTitle("¿Quienes Somos?")
            }
        )
    }
}