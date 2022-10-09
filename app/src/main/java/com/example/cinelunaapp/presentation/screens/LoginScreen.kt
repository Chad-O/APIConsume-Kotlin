package com.example.cinelunaapp.presentation.screens

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import com.example.cinelunaapp.MainActivity
import com.example.cinelunaapp.presentation.components.LoginFields

@Composable
fun LoginScreen(){
    val mcontext = LocalContext.current;
    var name = remember {
        mutableStateOf("")
    }
    LoginFields(
        name = name.value
        ,onNameChange = { name.value = it},
        onLoginClick = {
            mcontext.startActivity(Intent(mcontext, MainActivity::class.java).
            putExtra("name" , it))
        }
    )
}


