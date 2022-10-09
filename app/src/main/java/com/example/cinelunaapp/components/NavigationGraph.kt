package com.example.cinelunaapp.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.cinelunaapp.screens.LoginScreen
import com.example.cinelunaapp.screens.CarteleraScreen
import com.example.cinelunaapp.screens.SomosScreen
import com.example.cinelunaapp.screens.PeliculaScreen

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