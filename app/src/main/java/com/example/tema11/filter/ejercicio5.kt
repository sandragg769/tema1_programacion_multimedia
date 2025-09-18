package com.example.tema11.filter

//Define una función filtrarParesPositivos que reciba una lista de enteros y devuelva solo los números que sean positivos e impares.
fun main() {
    var listaNumeros = listOf(-1, 5, -8, 3, 10)
    println(filtrarParesPositivos(listaNumeros))
}

fun filtrarParesPositivos(lista: List<Int>): List<Int> {
    return lista.filter { it >= 0 && it % 2 != 0 }
}