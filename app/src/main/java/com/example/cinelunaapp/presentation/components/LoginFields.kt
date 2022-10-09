package com.example.cinelunaapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun LoginFields (
    name: String,
    onNameChange: (String) -> Unit,
    onLoginClick: (String) -> Unit
){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Cine Ulima App")
        Text(text = "Ingrese su nombre")
        OutlinedTextField(value = name , onValueChange = onNameChange)
        Button(onClick = {
            if(name != ""){
                onLoginClick(name)
            }
        }) {
            Text(text = "Login")
        }
    }
}