/**
 * @author Vladyslav Dumynsky
 * @version 0.1
 * Este programa representa a un Perfil de Usuario,
 * dispone de diferentes componentes:
 * foto de perfil, cinco gustos del usuariio, dos imagenes con botones de hacer Like,
 * tiene boton Seguir al usuario o dejar de seguir, boton de incrementar indicador de mensajes
 */
package com.example.vladyslavprofile.ui.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.vladyslavprofile.R
import com.example.vladyslavprofile.ui.screens.main.ButtonSuscribe
import com.example.vladyslavprofile.ui.screens.main.Hobbies
import com.example.vladyslavprofile.ui.screens.main.Images
import com.example.vladyslavprofile.ui.screens.main.IncrementMessageButton
import com.example.vladyslavprofile.ui.screens.main.LikeButtons
import com.example.vladyslavprofile.ui.screens.main.ProfileHeader
import com.example.vladyslavprofile.ui.screens.main.ProfileName

@Composable
        /**
         * @param modifier recibe el modifier de MainActivity
         */
fun Profile(modifier: Modifier) {
    var countMessage by rememberSaveable() { mutableIntStateOf(0) }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(colorResource(R.color.purple_background))
       ) {
        ProfileHeader(messageCount = countMessage)
        ButtonSuscribe()
        ProfileName()
        Hobbies()
        Images()
        LikeButtons()
        IncrementMessageButton(incrementCounterMessage = {countMessage++})
    }

}