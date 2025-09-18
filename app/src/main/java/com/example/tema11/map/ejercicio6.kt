package com.example.tema11.map

import com.example.tema11.filter.filtrarParesPositivos

//Define una función calcularPreciosFinales, que recibe una lista de precios (p.ej 23.19, 52.4, 12.0)
// y un impuesto (p.ej 0.21), y devuelve la lista de números con el impuesto aplicado.
fun main() {
    var listaPrecios = listOf(23.19, 52.4, 12.0)
    println(calcularPreciosFinales(listaPrecios, 0.21))
}

fun calcularPreciosFinales(listaPrecios: List<Double>, impuesto: Double): List<Double> {
    return listaPrecios.map { it * (1 + impuesto) }
}