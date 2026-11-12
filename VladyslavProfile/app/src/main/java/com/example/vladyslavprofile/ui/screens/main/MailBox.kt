package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
        /**
         * @param countMessage resibe el contador de mensajes
         * del componente ProfileHeader
         */
//Este componente sirve para tener icono de correos
// con el indicador de correos llegados
fun MailBox(countMessage: Int) {

    Row(modifier = Modifier
        .fillMaxWidth()
    ) {
        BadgedBox(
            badge = {
            if (countMessage > 0){
                Badge (
                    contentColor = Color.White,
                ){
                    Text(text = "$countMessage",
                        fontSize = 16.sp)
                }
            }
        }
        ) {
            Icon(
                imageVector = Icons.Filled.Mail,
                contentDescription = "mail",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}