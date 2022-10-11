package com.example.cinelunaapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.model.Pelicula
import com.example.cinelunaapp.presentation.components.DetallePelicula
import com.example.cinelunaapp.presentation.screens.PeliculaScreen
import com.example.cinelunaapp.ui.theme.CineLunaAppTheme

class ProfileActivity : ComponentActivity() {
    private val pelicula: Pelicula by lazy{
        intent?.getSerializableExtra(PELICULA_ID) as Pelicula
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CineLunaAppTheme{
                PeliculaScreen(peliculaData = pelicula)
            }
        }
    }
    companion object{
        private const val PELICULA_ID= "pelicula_id"
        fun newIntent(context: Context, pelicula: Pelicula)=
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(PELICULA_ID, pelicula)
            }
    }
}
