package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vladyslav.vladyslavtravelplanner.R

@Composable
fun CalculateButton(selectedCrewCount: Int, selectedIsland: String, distance: String, rations: String,
                    onClick:() -> Unit
                    ) {
    val isCrewValid = selectedCrewCount > 0
    val isIslandValid = selectedIsland.isNotEmpty() && selectedIsland != "Selecciona una Isla"
    val isDistanceValid = distance.matches( Regex("^[1-9][0-9]{0,4}$"))
    val isRationsValid = rations.matches(Regex("^\\d+$"))


    val isFormValid = isCrewValid && isIslandValid && isDistanceValid && isRationsValid
    Row (modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = onClick,
            enabled = isFormValid,
            modifier = Modifier
                .width(200.dp)
                .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.checkbox_list)
            ),

            ){
            Image(
                painter = painterResource(R.drawable.sunny),
                contentDescription = "logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)


            )
            Spacer(modifier =Modifier.width(8.dp))
            Text(text = "Calcular",
                fontSize = 25.sp,
                )
        }

    }
}