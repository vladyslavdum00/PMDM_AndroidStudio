package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.R
import com.example.vladyslavprofile.ui.screens.common.MySpacer

@Composable
//representa a un cuadro con dos imagenes
fun Images() {

    MySpacer(height = 30)
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(R.drawable.f1),
            contentDescription = "formula1",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(170.dp)
                .height(170.dp)

        )
        MySpacer(width = 30)
        Image(
            painter = painterResource(R.drawable.everest),
            contentDescription = "everest",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(170.dp)
                .height(170.dp)

            )
    }
}