package com.example.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinelunaapp.presentation.components.BotonVolver
import com.example.cinelunaapp.presentation.screens.Navegacion


@Composable
@Preview fun SomosScreen()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Text(text = "Mauricio Cisneros (20192624)",
                modifier = Modifier.padding(6.dp)
                    .padding(start = 0.dp, top = 40.dp, end = 0.dp, bottom = 5.dp),
                fontSize = 20.sp,
                textAlign = TextAlign.Center)

            Text(text = "Javier Olazábal (20191425)",
                modifier = Modifier.padding(6.dp)
                    .padding(start = 0.dp, top = 20.dp, end = 0.dp, bottom = 5.dp),
                fontSize = 20.sp,
                textAlign = TextAlign.Center)

            Text(text = "Ricardo Silva(20191923)",
                modifier = Modifier.padding(6.dp)
                    .padding(start = 0.dp, top = 20.dp, end = 0.dp, bottom = 5.dp),
                fontSize = 20.sp,
                textAlign = TextAlign.Center)
        }
        BotonVolver()
    }
}
