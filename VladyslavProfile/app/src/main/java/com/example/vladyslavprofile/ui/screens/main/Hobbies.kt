package com.example.vladyslavprofile.ui.screens.main

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocalMovies
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.SportsMotorsports
import androidx.compose.material.icons.filled.SportsVolleyball
import androidx.compose.material.icons.outlined.Landscape
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vladyslavprofile.R
import com.example.vladyslavprofile.ui.screens.common.MySpacer

@Composable
//Representa a un cuadro con gustos del usuario
fun Hobbies() {
    val hobbiesList = listOf(
        Icons.Default.Landscape to stringResource(R.string.preference_text1),
        Icons.Default.SportsVolleyball to stringResource(R.string.preference_text2),
        Icons.Default.SportsMotorsports to stringResource(R.string.preference_text3),
        Icons.Default.LocalMovies to stringResource(R.string.preference_text4),
        Icons.Default.MusicNote to stringResource(R.string.preference_text5)
    )

    MySpacer(height = 25)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(
                color = colorResource(R.color.purple_surface),
                shape = RoundedCornerShape(24.dp)
            )
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.hobbie_title),
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = colorResource(R.color.purple_primary)
        )

        MySpacer(height = 12)

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            hobbiesList.forEach { (icon, text) ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        tint = colorResource(R.color.purple_primary)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = text,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                }
            }
        }
    }
}