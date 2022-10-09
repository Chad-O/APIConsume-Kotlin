package com.example.cinelunaapp.presentation.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.presentation.components.DrawerMenu
import com.example.cinelunaapp.presentation.components.NavigationGraph
import com.example.cinelunaapp.presentation.components.TopBar
import kotlinx.coroutines.launch

@Composable
fun Navegacion(
    userName : String?
){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val titulo = remember {
        mutableStateOf("Hola $userName")
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
                onChangeTitle = changeTitle,
                userName = userName
            )
        }
    )
    {
        NavigationGraph(
            navController = navController,
            username = userName!!
        )
    }
}