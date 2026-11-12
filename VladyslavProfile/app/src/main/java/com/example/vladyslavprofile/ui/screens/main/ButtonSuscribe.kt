package com.example.vladyslavprofile.ui.screens.main

import android.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.R
import com.example.vladyslavprofile.ui.screens.profile.Profile
import org.w3c.dom.Text

@Composable
//Representa a un boton que tiene dos estados Seguir y Dejar de seguir,
//aplicando diferentes estilos dependiendo en que estado esta
fun ButtonSuscribe() {
    var subscription by rememberSaveable() { mutableStateOf(false) }
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
        ) {
        OutlinedButton(onClick = {
            subscription = !subscription
        },
            colors = if (!subscription){
                ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.purple_primary))
            }else{
                ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color(Color.TRANSPARENT)
                    )
            }
            ) {
            if(!subscription){
                Text(text = stringResource(R.string.sucribe_button_text1),
                    color = colorResource(R.color.white),

                    )

            }else{
                Text(text = stringResource(R.string.sucribe_button_text2),
                    color = colorResource(R.color.black),
                    fontWeight = FontWeight.Black

                    )

            }
        }
        Spacer(modifier = Modifier.width(30.dp))
    }
}