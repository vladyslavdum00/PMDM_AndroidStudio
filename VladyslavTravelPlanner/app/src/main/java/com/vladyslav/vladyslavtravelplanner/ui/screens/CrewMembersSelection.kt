package com.vladyslav.vladyslavtravelplanner.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CrewMembersSelection() {
    data class Check(
        val title: String,
        val selected: Boolean,
        val onCheckedChange: (Boolean) -> Unit
    )

    @Composable
    fun getChecks(vararg titles: String): List<Check>{
        return titles.map {
            var state by rememberSaveable { mutableStateOf(false) }
            Check(
                title = it,
                selected = state,
                onCheckedChange = {state = it}
            )
        }
    }

    @Composable
    fun CustomCheckBox(check: Check) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = check.selected,
                onCheckedChange = {check.onCheckedChange(it)}
            )
            Text(text = check.title)
        }

    }
    val crewsCheckbox = getChecks("\uD83C\uDF56 Luffy",
        "⚔\uFE0F Zoro",
        "\uD83C\uDF4A Nami",
        "\uD83C\uDF73 Sanji",
        "\uD83C\uDFAF Usopp",
        "\uD83E\uDD8C Chopper",
        "\uD83C\uDFBB Brook",
        "\uD83D\uDCDA Robin",
        "\uD83E\uDD16 Franky"
    )
    Spacer(modifier = Modifier.height(25.dp))
    Column(modifier = Modifier
        .width(390.dp)
        .height(150.dp)
        .background(Color.Gray,
            shape = RoundedCornerShape(30.dp)
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,) {
        crewsCheckbox.chunked(3).forEach {
            Row() {it.forEach {
                CustomCheckBox(check = it)
            } }
        }
    }


}