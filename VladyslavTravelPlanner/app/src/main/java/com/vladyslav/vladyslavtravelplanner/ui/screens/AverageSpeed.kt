package com.vladyslav.vladyslavtravelplanner.ui.screens

import android.R.attr.thumb
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSliderState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun AverageSpeed(onSpeedChange: (Float) -> Unit) {

    Row(
        modifier = Modifier
            .width(400.dp)
            .background(colorResource(R.color.surface),
                shape = RoundedCornerShape(30.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        val sliderValue = rememberSliderState(
            value = 5f,
            steps = 19,
            trackRange = 5f..25f
        )
        Slider(
            state = sliderValue,
            onValueChange = {newValue -> sliderValue.value = newValue
            onSpeedChange(newValue)
            },
            thumb = {

                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(colorResource(R.color.checkbox_list), shape = CircleShape)
                            .border(2.dp, colorResource(R.color.header_text), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Speed,
                            contentDescription = "sliderIcon",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
            },
            modifier = Modifier
                .width(330.dp),

            colors = SliderDefaults.colors(
                activeTrackColor = colorResource(R.color.islands_list),
                inactiveTrackColor = colorResource(R.color.islands_list),
                inactiveTickColor = colorResource(R.color.white)
            )
        )
        Spacer(modifier = Modifier.width(8.dp))

        Text(text = sliderValue.value.toInt().toString())

    }
}