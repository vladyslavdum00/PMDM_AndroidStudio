package com.vladyslav.vladyslavtravelplanner.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.math.ceil

@Composable
fun TripResultDialog(
    crewCount: Int,
    island: String,
    distance: String,
    speed: Float,
    availableRations: String,
    onDismiss: () -> Unit
) {
    // 1. Duración en horas: distancia (millas náuticas) / velocidad (nudos)
    val estimatedHours = if (speed.toDouble() > 0.0) distance.toDouble() / speed.toDouble() else 0.0

    // 2. Duración en días: horas / 24 redondeada siempre hacia arriba
    val estimatedDays = ceil(estimatedHours / 24.0).toInt()

    // 3. Raciones necesarias: 2 raciones por cada tripulante y día de viaje
    val neededRations = crewCount * estimatedDays * 2

    // 4. Viabilidad: raciones disponibles >= raciones necesarias
    val isViable = availableRations.toInt() >= neededRations

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = if (isViable) "✅ ¡Viaje Viable!" else "❌ Viaje No Viable",
                color = if (isViable) Color.Green else Color.Red,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("👥 Tripulantes seleccionados: $crewCount")
                Text("🏝️ Destino: $island (${distance.toInt()} millas náuticas)")
                Text("⛵ Velocidad: ${speed.toInt()} nudos")
                Text("⏱️ Duración estimada: $estimatedHours horas")
                Text("📅 Duración en días: $estimatedDays días")
                Text("🍖 Raciones: $availableRations disponibles / $neededRations necesarias")
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Aceptar")
            }
        }
    )
}