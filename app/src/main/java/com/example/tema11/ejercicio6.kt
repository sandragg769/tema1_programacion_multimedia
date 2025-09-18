package com.example.tema11

fun main() {
    val precios = listOf(23.19, 52.4, 12.0)
    print(calcularPreciosFinales(precios, 0.21))
}

fun calcularPreciosFinales(lista: List<Double>, impuesto: Double): List<Double> {
    return lista.map { it * (1 + impuesto) }
}