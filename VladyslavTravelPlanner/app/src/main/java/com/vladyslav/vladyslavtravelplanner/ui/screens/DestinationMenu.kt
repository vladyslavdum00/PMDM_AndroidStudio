package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenu
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.math.exp

@Composable
fun DestinationMenu() {
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
    var selectedOptionText by rememberSaveable {mutableStateOf("Selecciona una opción")}
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp)
        .background(Color.White)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }

        ){
            OutlinedTextField(
                modifier = Modifier.menuAnchor(type = ExposedDropdownMenuAnchorType.PrimaryNotEditable),
                readOnly = true,
                value = selectedOptionText,
                onValueChange = {},
                label = { Text(text = "Isla") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)}
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                islands.forEach { option -> DropdownMenuItem(
                        text = {Text(text = option)},
                    onClick = {
                        selectedOptionText = option
                        expanded = false
                    }
                ) }
            }
        }
    }
    
}