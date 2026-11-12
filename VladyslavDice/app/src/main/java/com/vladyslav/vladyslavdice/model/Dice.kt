package com.vladyslav.vladyslavdice.model

class Dice(faces: Int) {
    var faces: Int = faces
        private set
    private var quantityOfThrows = 0
    private val history: MutableList<Int> = mutableListOf()

    init {
        if (faces <= 1) this.faces = 6
    }

    constructor() : this(6)

    fun throwDice(): Int {
        quantityOfThrows++
        val value = (1..faces).random()
        history.add(value)
        return value
    }

    companion object {
        fun throwDice(faces: Int): Int {
            return (1..faces).random()
        }
    }

    fun statistics(): String{
        val title = "=  Dado de $faces caras  ="
        var infoRecord = "=".repeat(title.length)

        infoRecord += """|
            |$title
            |$infoRecord
            |Se ha tirado $quantityOfThrows veces
            |
        """.trimMargin()

        if (history.isEmpty()) {
            infoRecord += "No hay estadísticas."
        } else {
            // Se crea un mapa con la estructura: nº_cara -> veces que ha salido
            val frequency = mutableMapOf<Int, Int>()
            // Se rellena el mapa con los datos extraidos del historial de tiradas
            for (number in 1..faces) {
                var count = 0
                for (value in history) {
                    if (value == number) {
                        count++
                    }
                }
                frequency[number] = count
            }

            // Se obtiene el menor y el mayor de nº de veces
            val minTimes = frequency.values.min()
            val maxTimes = frequency.values.max()
            // Se obtienen las caras con menos y más apariciones
            val leastFrequent = frequency.filter { it.value == minTimes }.keys
            val mostFrequent = frequency.filter { it.value == maxTimes }.keys

            infoRecord += "Cara que menos veces han salido:"
            leastFrequent.forEach {
                infoRecord += " $it"
            }
            infoRecord += " ($minTimes veces)\n"

            infoRecord += "Cara que más veces han salido:"
            mostFrequent.forEach {
                infoRecord += " $it"
            }
            infoRecord += " ($maxTimes veces)\n"

            infoRecord += "Porcentaje de cada cara:\n"
            frequency.forEach { (face, times) ->
                infoRecord += " - $face: ${times * 100.0 / history.size} %\n"
            }
        }

        return infoRecord
    }

    fun reset() {
        quantityOfThrows = 0
        history.clear()
    }

    fun resetStatistics() {
        quantityOfThrows = 0
    }
}