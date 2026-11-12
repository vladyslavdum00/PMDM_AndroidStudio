package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.R

@Composable
        /**
         * @param messageCount recibe el contador de mensajes del ProfileScreen
         */
//Contiene la imagen de perfil y icono de correos con el indicador de correos llegados
fun ProfileHeader(messageCount: Int) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(colorResource(R.color.purple_primary_dark)),

    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 60.dp, start = 20.dp)
        ) {
            MailBox(countMessage = messageCount)
        }


        Box(
            modifier = Modifier.align(Alignment.Center)
        ) {
            ProfileImage()
        }
    }
    }
