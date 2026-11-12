package com.vladyslav.prueba.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Mood
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Content(modifier: Modifier = Modifier) {
    var textFieldValue by rememberSaveable() { mutableStateOf("") }
    var checked by rememberSaveable() {mutableStateOf(false) }

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        TextField(

            value = textFieldValue,
            onValueChange = {textFieldValue = it},
            label = {Text(text = "Campo de texto",
                fontWeight = FontWeight.Bold,
                color = Color.White
                )},
            placeholder = {Text(text = "Nombre")},

            leadingIcon = {
                if (checked){
                    Icon(
                        imageVector = Icons.Default.Mood,
                        contentDescription = "leadIcon",
                        tint = Color.Yellow
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    textFieldValue = ""
                }) {
                   if (textFieldValue.isNotEmpty()){
                       Icon(
                           imageVector = Icons.Default.Delete,
                           contentDescription = "delete",
                           tint = Color.Red
                       )
                   }
                }
            },
            enabled = checked,


        )
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = !checked
            },
            colors = SwitchDefaults.colors(
                checkedTrackColor = Color.Magenta,
                checkedThumbColor = Color.Black,
                checkedBorderColor = Color.Black,

            )
        )
    }
    
}