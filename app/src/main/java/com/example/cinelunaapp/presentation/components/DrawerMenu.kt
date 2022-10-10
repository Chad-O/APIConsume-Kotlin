package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.Divider
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun DrawerMenu(
    navController: NavController,
    userName: String?,
    onCloseDrawer : () -> Unit,
    onChangeTitle: (String)->Unit
){
    Column(
        modifier= Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ){
            Text(
                //Debe ser el nombre ingresado en login
                text = userName!!,
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 27.sp,
            )
        Divider(
            modifier = Modifier.fillMaxWidth()
                .border(2.dp,Color.Black)
        )
        Text(
            text = "Cartelera",
            textAlign = TextAlign.Left,
            modifier = Modifier
                .height(50.dp)
                .padding(10.dp)
                .clickable
                {
                    //Agregar el lugar de navegacion
                    navController.navigate("cartelera")
                    onCloseDrawer()
                    onChangeTitle("Hola ${userName}")
                }
        )
        Text(
            text = "Sobre Nosotros",
            textAlign = TextAlign.Left,
            modifier = Modifier
                .height(50.dp)
                .padding(10.dp)
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