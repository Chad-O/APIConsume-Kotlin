package com.example.cinelunaapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(
    title : String,
    onOpenDrawer : () -> Unit
){
    TopAppBar(

        title = {
            Text(text = title,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    )

        },
        navigationIcon = {
            IconButton(
                onClick = {onOpenDrawer()},
            ){
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Drawer"
                )
            }
        }
    )
}
