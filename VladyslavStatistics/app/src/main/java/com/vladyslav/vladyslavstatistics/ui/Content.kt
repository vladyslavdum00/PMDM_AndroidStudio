package com.vladyslav.vladyslavstatistics.ui

/**
 * @autor Vladyslav Dumynsky
 * @version 0.1
 */
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

/**
 * @param  modifier parametro recibido
 *Esta funcion genera una interfaz con botones para los contadores y muestra estadisricas
 */
@Composable
fun Content(modifier: Modifier = Modifier) {
    var countPerson by rememberSaveable() { mutableIntStateOf(0) }
    var countElectricScooter by rememberSaveable() { mutableIntStateOf(0) }
    var countBicicle by rememberSaveable() { mutableIntStateOf(0) }
    var countCar by rememberSaveable() { mutableIntStateOf(0) }
    var total by rememberSaveable() {mutableIntStateOf(0) }
    total = countCar + countBicicle + countPerson + countElectricScooter
    //Titulo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Estadísticas Vladyslav",
            fontSize = 28.sp,
            modifier = Modifier.padding(top = 35.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Total: $total",
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {
                    total = 0
                    countPerson = 0
                    countElectricScooter = 0
                    countBicicle = 0
                    countCar = 0
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                )
            ) {
                Text("RESET ALL", fontSize = 20.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        //La parte con contadores de Personas
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Personas:",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text(
                text = "$countPerson",
                fontSize = 40.sp
            )

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        countPerson++
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00563B))
                ) {
                    Text("+1", fontSize = 20.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        countPerson--

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDAA520))
                ) {
                    Text("-1", fontSize = 20.sp, color = Color.White)
                }
            }

            Spacer(modifier = Modifier.width(16.dp))


            Button(
                onClick = { countPerson = 0},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("RESET", fontSize = 20.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        //La parte con contadores de Patinetes
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Patinetes:",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text(
                text = "$countElectricScooter",
                fontSize = 40.sp
            )

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        countElectricScooter++

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00563B))
                ) {
                    Text("+1", fontSize = 20.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        countElectricScooter--

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDAA520))
                ) {
                    Text("-1", fontSize = 20.sp, color = Color.White)
                }
            }

            Spacer(modifier = Modifier.width(16.dp))


            Button(
                onClick = { countElectricScooter = 0},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("RESET", fontSize = 20.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        //La parte con contadores de Bicicletas
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Bicicletas:",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text(
                text = "$countBicicle",
                fontSize = 40.sp
            )

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        countBicicle++

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00563B))
                ) {
                    Text("+1", fontSize = 20.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        countBicicle--
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDAA520))
                ) {
                    Text("-1", fontSize = 20.sp, color = Color.White)
                }
            }

            Spacer(modifier = Modifier.width(16.dp))


            Button(
                onClick = { countBicicle = 0},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("RESET", fontSize = 20.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        //La parte con contadores de Coches
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Coches:",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text(
                text = "$countCar",
                fontSize = 40.sp
            )

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {  countCar++},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00563B))
                ) {
                    Text("+1", fontSize = 20.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {  countCar--},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDAA520))
                ) {
                    Text("-1", fontSize = 20.sp, color = Color.White)
                }
            }

            Spacer(modifier = Modifier.width(16.dp))


            Button(
                onClick = { countCar = 0},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text(
                    "RESET",
                    fontSize = 20.sp,
                    color = Color.White)

            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        //La parte de randomizer
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = {
                        countPerson += (0..10).random()
                        countElectricScooter += (0..10).random()
                        countBicicle += (0..10).random()
                        countCar += (0..10).random()
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0070FF))
            ) {
                Text("RANDOMIZE", fontSize = 20.sp, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        //La parte de estadísticas
        Column() {
            Text(
                text = "Estadísticas",
                fontSize = 20.sp
            )
        }
        Row() {
            Column() {
                Text(
                    text = """🚶 Personas: ${if (total > 0) (countPerson * 100) / total else 0}%
                    |🛴 Patinetes: ${if (total > 0) (countElectricScooter * 100) / total else 0}%
                """.trimMargin()
                )
            }
            Spacer(modifier = Modifier.width(50.dp))
            Column() {
                Text(
                    text = """🚲 Bicicletas: ${if (total > 0) (countBicicle * 100) / total else 0}%
                    |🚗 Coches: ${if (total > 0) (countCar * 100) / total else 0}%
                    
                """.trimMargin()
                )
            }
        }


    }




}