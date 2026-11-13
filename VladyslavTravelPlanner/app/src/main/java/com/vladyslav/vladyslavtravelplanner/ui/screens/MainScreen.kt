package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.background)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Header()
        CrewMembersSelection()
        Spacer(modifier = Modifier.height(20.dp))
        DestinationMenu()
    }
}