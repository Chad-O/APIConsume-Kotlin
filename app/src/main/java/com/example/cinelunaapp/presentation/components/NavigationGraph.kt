package com.example.cinelunaapp.presentation.components

import android.security.identity.AccessControlProfile
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.screens.LoginScreen
import com.example.cinelunaapp.presentation.screens.CarteleraScreen
import com.example.cinelunaapp.presentation.screens.SomosScreen
import com.example.cinelunaapp.presentation.screens.PeliculaScreen

@Composable
fun NavigationGraph(
    navController : NavHostController,
    username : String
){
    NavHost(
        navController = navController,
        startDestination = "cartelera"
    ){
        composable("somos"){
            SomosScreen(navController)
        }
        composable("cartelera"){
            CarteleraScreen(username, navController)
        }
        composable("pelicula/{peliIndex}"){ backStackEntry ->
            PeliculaScreen(navController , backStackEntry.arguments?.getString("peliIndex")!!)
            println("dasd" + backStackEntry.arguments?.getString("peliIndex")!!)
        }
    }
}