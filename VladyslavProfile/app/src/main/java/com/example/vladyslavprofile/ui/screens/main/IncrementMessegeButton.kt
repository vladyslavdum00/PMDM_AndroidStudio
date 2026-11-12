package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.ui.screens.common.MySpacer

@Composable
        /**
         * @param incrementCounterMessage recibe una lambda que incremeta contador de correos
         */
//Representa a un boton que al pulsarlo incrementa contador de correos
fun IncrementMessageButton(incrementCounterMessage:() -> Unit) {
    MySpacer(height = 30)
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = incrementCounterMessage,
            shape = CircleShape,
            modifier = Modifier.size(60.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "add",
                modifier = Modifier.size(35.dp)
            )
        }
    }

}