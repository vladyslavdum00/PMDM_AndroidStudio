package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var selectedCrewCount by rememberSaveable { mutableIntStateOf(0) }
    var selectedIsland by rememberSaveable { mutableStateOf("Selecciona una Isla") }
    var distance by rememberSaveable { mutableStateOf("") }
    var speed by rememberSaveable { mutableFloatStateOf(5f) }
    var rations by rememberSaveable { mutableStateOf("") }
    var showDialog by rememberSaveable { mutableStateOf(false) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.background)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Header()
        CrewMembersSelection(onCrewCountChange = { selectedCrewCount = it })
        Spacer(modifier = Modifier.height(20.dp))
        DestinationMenu(selectedIsland = selectedIsland,
            onIslandChange = { selectedIsland = it },
            distance = distance,
            onDistanceChange = { distance = it })
        Spacer(modifier = Modifier.height(20.dp))
        AverageSpeed(onSpeedChange = {speed = it})
        Spacer(modifier = Modifier.height(20.dp))
        Rations(onRationsChange = {rations = it},
            rations = rations)
        Spacer(modifier = Modifier.height(40.dp))
        CalculateButton(selectedCrewCount = selectedCrewCount, selectedIsland = selectedIsland, distance = distance, rations = rations, onClick = {showDialog = true} )
        if (showDialog){
            TripResultDialog (crewCount = selectedCrewCount, island = selectedIsland, distance = distance, speed = speed, availableRations = rations, onDismiss = {showDialog = false})

            }
        Spacer(modifier = Modifier.height(20.dp))
        Footer()
        }
    }
