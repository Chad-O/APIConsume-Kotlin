package com.example.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.cinelunaapp.presentation.components.DrawerMenu
import com.example.cinelunaapp.presentation.components.NavigationGraph
import com.example.cinelunaapp.presentation.components.TopBar
import kotlinx.coroutines.launch

@Composable
@Preview fun SomosScreen(){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Mauricio Cisneros (20192624)")
        Text(text = "Javier Olazábal (20191425)")
        Text(text = "Ricardo Silva(20191923)")
        Button(onClick = { /*TODO*/ } , modifier = Modifier.width(200.dp)) {
            Text(text = "Regresar")
        }
    }
}
