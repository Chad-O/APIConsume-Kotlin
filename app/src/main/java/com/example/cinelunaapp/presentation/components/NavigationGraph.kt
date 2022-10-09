package com.example.cinelunaapp.presentation.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.cinelunaapp.presentation.screens.LoginScreen
import com.example.cinelunaapp.presentation.screens.CarteleraScreen
import com.example.cinelunaapp.presentation.screens.SomosScreen
import com.example.cinelunaapp.presentation.screens.PeliculaScreen

@Composable
fun NavigationGraph(
    navController : NavHostController
){
    NavHost(
        navController = navController,
        startDestination = "login"
    ){
        composable("login"){
            LoginScreen()
        }
        composable("somos"){
            SomosScreen()
        }
        composable("cartelera"){
            CarteleraScreen()
        }
        composable("pelicula"){
            PeliculaScreen()
        }
    }
}