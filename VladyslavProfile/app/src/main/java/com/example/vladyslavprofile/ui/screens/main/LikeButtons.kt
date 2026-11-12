package com.example.vladyslavprofile.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.vladyslavprofile.R
import com.example.vladyslavprofile.ui.screens.common.MySpacer

@Composable
//Representa a un componente que tienes dos botones,
//los botones tienen dos estados Me gusta y no me gusta,
//se aplican diferentes estilos dependiendo en que estado esta
fun LikeButtons() {
    var like1 by rememberSaveable() { mutableStateOf(false) }
    var like2 by rememberSaveable() { mutableStateOf(false) }
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        IconButton(onClick = {
            like1 = !like1
        }
        ) {
            if (like1){
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = "favorite1",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(R.color.purple_accent),
                )
            }else{
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "favorite1",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        }


        MySpacer(width = 150)
        IconButton(onClick = {
            like2 = !like2
        }) {
            if(like2){
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = "favorite2",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(R.color.purple_accent)
                )
            }else{
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "favorite2",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        }
    }
}