package com.example.cinelunaapp.model

import java.io.Serializable

data class Pelicula(
    val nombre : String,
    val hora : String,
    val resena : String
): Serializable

class GestorPeliculas private constructor(){
    private val peliculas = mutableListOf<Pelicula>()

    init{
        peliculas.add(Pelicula("Dr Strange 2", "15:00", "Doctor Strange en el Multiverso de la Locura (en inglés: Doctor Strange in the Multiverse of Madness) es una película de superhéroes estadounidense basada en el personaje Doctor Strange, de Marvel Comics. Producida por Marvel Studios y distribuida por Walt Disney Studios Motion Pictures, es la secuela de Doctor Strange (2016) y la película número 28 del Universo cinematográfico de Marvel (UCM). La película está dirigida por Sam Raimi, escrita por Michael Waldron, y está protagonizada por Benedict Cumberbatch como Stephen Strange, junto a Elizabeth Olsen, Chiwetel Ejiofor, Benedict Wong, Xochitl Gomez, Michael Stuhlbarg y Rachel McAdams. En la película, Strange viaja a través del multiverso para proteger a América Chávez (Gómez), una adolescente capaz de abrir portales en forma de estrella a distintos universos, de Wanda Maximoff (Olsen)."))
        peliculas.add(Pelicula("Top Gun Maverick", "17:00", "Top Gun: Maverick se lleva a cabo 35 años después de los eventos de la película original y muestra al legendario piloto Pete 'Maverick' Mitchell (Tom Cruise), como capitán y nuevo instructor de vuelo de la academia de pilotos de combate Top Gun en California. Allí guía ahora a los nuevos pilotos de combate, hombres y mujeres. Entre ellos está el teniente Bradley Bradshaw (Milles Teller), el hijo de Goose, su antiguo compañero que falleció en un accidente de vuelo durante el entrenamiento de pilotos, que busca convertirse ahora en un aviador mucho mejor de lo que su padre era."))
        peliculas.add(Pelicula("Detective Pikachu", "11:00","Pokémon: Detective Pikachu es una película de fantasía\u200B dirigida por Rob Letterman y escrita por Nicole Perlman y Letterman, basada en el videojuego del mismo nombre. La película es una empresa conjunta estadounidense y japonesa producida por Legendary Pictures, The Pokémon Company, Warner Bros. Pictures y Toho."))
    }

    fun obtenerPeliculas(): List<Pelicula> {
        return peliculas;
    }

    // SINGLETON
    // definimos los metodos de clase para la clase GestorPeliculas.
    companion object{
        private var instancia : GestorPeliculas? = null;
        fun obtenerInstancia() : GestorPeliculas{
            if (instancia == null){
                instancia = GestorPeliculas();
            }
            return instancia!!
        }
    }

}