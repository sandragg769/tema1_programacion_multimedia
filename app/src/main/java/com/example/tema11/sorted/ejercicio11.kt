package com.example.tema11.sorted

import kotlin.math.absoluteValue

//Define una función ordenarTemperaturas, que, dada una lista de temperaturas, ordene por su valor absoluto,
// es decir, independientemente de que sean negativas o positivas.
fun ordenarTemperaturas(lista: List<Double>): List<Double> {
    //sortedby para conseguir el valor absoluto
    return lista.sortedBy { it.absoluteValue }
}


fun main() {
    //poner Doubles, no mezclar con Int
    val temperaturas = listOf(28.8, -2.0, 19.0)
    println(ordenarTemperaturas(temperaturas))
}

