package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun Footer() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(R.color.header)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,) {

        Image(
            painter = painterResource(R.drawable.fotoprofile),
            contentDescription = "foto",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Vladyslav Dumynsky",
            color = colorResource(R.color.header_text))
    }
}