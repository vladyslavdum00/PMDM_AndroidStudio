package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun Header() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(R.color.header))
        .padding(top = 25.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,


        ) {
        Text(text = "Travel Planner",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            color = colorResource(R.color.header_text)
        )
        Spacer(modifier =Modifier.width(25.dp))
        Image(
            painter = painterResource(R.drawable.bandera),
            contentDescription = "bandera",
            modifier = Modifier.size(100.dp)
        )
    }

}