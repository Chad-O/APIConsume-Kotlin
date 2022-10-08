package com.example.cinelunaapp.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.components.DrawerMenu
import com.example.cinelunaapp.components.NavigationGraph
import com.example.cinelunaapp.components.TopBar
import kotlinx.coroutines.launch

@Composable
@Preview fun PeliculaScreen(

){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val titulo = remember {
        //Agregar Titulo de la pelicula seleccionada
        mutableStateOf("Titulo de la pelicula")
    }

    val openDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }

    val closeDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }
    var changeTitle : (String) -> Unit = {newTitulo ->
        titulo.value = newTitulo
    }

    Scaffold (
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                title = titulo.value,
                onOpenDrawer = openDrawer
            )
        },
        drawerContent = {
            DrawerMenu(
                navController = navController,
                onCloseDrawer = closeDrawer,
                onChangeTitle = changeTitle
            )
        }
    ){
        NavigationGraph(
            navController = navController
        )
    }

    //Aqui se agrega el resto
}