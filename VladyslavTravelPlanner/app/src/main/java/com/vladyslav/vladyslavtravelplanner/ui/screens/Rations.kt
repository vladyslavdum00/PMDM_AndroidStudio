package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun Rations(onRationsChange:(String) -> Unit, rations: String) {
    val positiveIntegersRegex = remember { Regex("^\\d*$") }
    val hasError = !rations.matches(positiveIntegersRegex)

    Row(modifier = Modifier
        .width(400.dp)
        .height(100.dp)
        .background(colorResource(R.color.surface),
            shape = RoundedCornerShape(30.dp)
        ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = rations,
            onValueChange = onRationsChange,
            label = { Text(text = "Raciones disponibles",
                color = Color.Black,
                fontWeight = FontWeight.Medium) },
            isError = hasError,
            supportingText = {
                if (hasError) {
                    Text(
                        text = "Solo números enteros mayores o iguales a 0",
                        color = Color.Red
                    )
                }
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                unfocusedBorderColor = colorResource(R.color.islands_list),
                focusedBorderColor = colorResource(R.color.islands_list)

            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true
        )
    }


}