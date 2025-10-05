package com.example.tema11.zip
//Usar zip y unzip
//Une nombres y edades con zip y luego sepáralos de nuevo con unzip.

fun main() {
    val nombres = listOf("Sofía", "Marcos", "Elena")
    val edades = listOf(18, 21, 19)

    val pares = nombres.zip(edades)  // [(Sofía,18), (Marcos,21), (Elena,19)]
    println("Pares: $pares")

    val (nombresSeparados, edadesSeparadas) = pares.unzip()
    println("Nombres: $nombresSeparados")
    println("Edades: $edadesSeparadas")
}