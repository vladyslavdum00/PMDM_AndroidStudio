package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.R

@Composable
//Representa a un componente de Foto de perfil de usuario
fun ProfileImage() {
    Row(modifier = Modifier
        .offset(y = 55.dp)) {
        Image(
            painter = painterResource(R.drawable.fotoprofile),
            contentDescription = "image",
            modifier = Modifier
                .clip(CircleShape)
                .height(170.dp)
                .width(170.dp)

                .border(
                    width = 3.dp,
                    color = colorResource(R.color.purple_primary_dark),
                    shape = CircleShape
                ),
            contentScale = ContentScale.FillWidth


        )
    }
}