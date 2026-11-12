package com.example.vladyslavprofile.ui.screens.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySpacer(height: Int = 0, width: Int = 0, size: Int = 0) {
    val modifier = when {
        // Prioridad al tamaño cuadrado
        size > 0 -> Modifier.size(size.dp)
        // Altura y ancho específicos
        height > 0 && width > 0 -> Modifier.height(height.dp).width(width.dp)
        // Solo altura
        height > 0 -> Modifier.height(height.dp)
        // Solo ancho
        width > 0 -> Modifier.width(width.dp)
        // Sin modificadores
        else -> Modifier
    }
    Spacer(
        modifier = modifier
    )
}