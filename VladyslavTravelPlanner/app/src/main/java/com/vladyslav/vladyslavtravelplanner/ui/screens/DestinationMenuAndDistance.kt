package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenu
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
fun DestinationMenu(
    selectedIsland: String,
    onIslandChange: (String) -> Unit,
    distance: String,
    onDistanceChange: (String) -> Unit
) {
    val islands = listOf(
        "Arabasta",
        "Little Garden",
        "Drum",
        "Jaya",
        "Skypiea",
        "Water 7",
        "Enies Lobby",
        "Sabaody",
        "Isla Gyojin",
        "Punk Hazard",
        "Dressrosa",
        "Whole Cake Island",
        "Wano",
        "Egghead",
        "Elbaf"
    )

    var expanded by rememberSaveable { mutableStateOf(false) }

    val distanceRegex = remember { Regex("^([1-9][0-9]{0,4})?$") }
    val hasError = !distance.matches(distanceRegex)

    Row (modifier = Modifier
        .width(400.dp)
        .height(100.dp)
        .background(colorResource(R.color.surface),
            shape = RoundedCornerShape(30.dp)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }

        ){
            OutlinedTextField(
                modifier = Modifier
                    .width(220.dp)
                    .menuAnchor(type = ExposedDropdownMenuAnchorType.PrimaryNotEditable),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    unfocusedBorderColor = colorResource(R.color.islands_list),
                    focusedBorderColor = colorResource(R.color.islands_list)

                ),

                readOnly = true,
                value = selectedIsland,
                onValueChange = {},
                label = {

                        Text(
                            text = "Islas",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                },

                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)}
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .background(colorResource(R.color.islands_list))
            ) {
                islands.forEach { option -> DropdownMenuItem(
                        text = {Text(text = option,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black)},
                    onClick = {
                        onIslandChange(option)
                        expanded = false
                    }
                ) }
            }
        }
        Spacer(modifier = Modifier.width(25.dp))
        OutlinedTextField(
            value = distance,
            onValueChange = onDistanceChange,

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                unfocusedBorderColor = colorResource(R.color.islands_list),
                focusedBorderColor = colorResource(R.color.islands_list)

            ),
            label = {

                Text(
                    text = "Distancia",
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
            },
            isError = hasError,
            supportingText = {if (hasError){
                Text(text = "Formato no valido",
                    color = Color.Red)
            } },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            modifier = Modifier
                .width(120.dp)
        )
    }
    
}