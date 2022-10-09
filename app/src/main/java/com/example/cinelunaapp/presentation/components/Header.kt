package com.example.cinelunaapp.presentation.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext


@Composable
fun Header(){
    Text(
        text = LocalContext.current.getString(
    1
        )
    )
}