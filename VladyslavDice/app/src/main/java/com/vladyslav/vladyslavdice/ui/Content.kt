package com.vladyslav.vladyslavdice.ui

import androidx.compose.animation.unveilIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vladyslav.vladyslavdice.R
import com.vladyslav.vladyslavdice.model.Dice

@Composable
fun Content(
    modifier: Modifier
) {
    var hp by rememberSaveable() { mutableIntStateOf(20) }
    var diceNumber by rememberSaveable() { mutableIntStateOf(Dice.throwDice(6))}
    var bet by rememberSaveable() {mutableIntStateOf(0) }
    var lastThrow by rememberSaveable() {mutableIntStateOf(0) }



    Column(modifier = Modifier
        .fillMaxSize()
        .then(modifier)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

        ) {

            Text(text = stringResource(R.string.title),
                fontSize = dimensionResource(R.dimen.title).value.sp,

            )

        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(R.string.sub_title),
                fontSize = dimensionResource(R.dimen.text).value.sp
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text(text = stringResource(R.string.hp_points, hp))
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {
            Row(modifier = Modifier
                .height(200.dp)
                .width(300.dp)
                .fillMaxWidth()
                .background(color = Color.LightGray),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
                ) {
                Text("$diceNumber",
                    fontSize = dimensionResource(R.dimen.title).value.sp,
                    color = colorResource(R.color.black)
                )

            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(onClick = {

                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 1
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber

            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor))
            ) { Text("1",
                fontSize = dimensionResource(R.dimen.button_text).value.sp
            )

            }
            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))

            Button(onClick = {
                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 2
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber
            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor))
            ) { Text("2",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}

            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))

            Button(onClick = {
                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 3
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber
            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor))
            ) { Text("3",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}

            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))

        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
            Button(onClick = {
                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 4
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber
            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor))
            ) { Text("4",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}

            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))

            Button(onClick = {
                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 5
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber
            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor))
            ) { Text("5",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}


            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))

            Button(onClick = {
                if (hp > 3){
                    hp -= 3
                }else if ((hp - 3) < 0){
                    hp = 0
                }
                bet = 6
                diceNumber = Dice.throwDice(6)
                if(diceNumber  == bet){
                    if ((hp + 15) > 20) hp = 20 else hp += 15
                }
                lastThrow = diceNumber
            },
                colors = ButtonDefaults.buttonColors(colorResource(R.color.numButtonColor)
                )
            ) { Text("6",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}

        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(onClick = {
               if ((hp - 1) < 0) hp = 0 else hp -= 1
                diceNumber = Dice.throwDice(6)
                if (diceNumber > lastThrow){
                    if ((hp + 3) > 20) hp = 20 else hp += 3
                }
            }) { Text("⬆\uFE0F",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}
            Spacer(modifier.width(dimensionResource(R.dimen.button_space_width).value.dp))
            Button(onClick = {if ((hp - 1) < 0) hp = 0 else hp -= 1
                diceNumber = Dice.throwDice(6)
                if (diceNumber < lastThrow){
                    if ((hp + 3) > 20) hp = 20 else hp += 3
                }}) { Text("⬇\uFE0F",
                fontSize = dimensionResource(R.dimen.button_text).value.sp)}
        }
        if (hp == 0){
            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    hp = 20
                }) { Text(text = stringResource(R.string.restart_game),
                    fontSize = dimensionResource(R.dimen.button_text).value.sp)}
            }
        }

        Row(modifier = Modifier.fillMaxWidth()
            .background(colorResource(R.color.teal_700)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(R.string.autor_name),
                fontSize = dimensionResource(R.dimen.title).value.sp
                )
        }





    }
}