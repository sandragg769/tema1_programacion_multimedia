package com.example.tema11.reduce

// Define una función multiplicaPares, que calcula el acumulado de productos de los números pares de la lista.
fun main() {
    println(multiplicaPares(listOf(1, 2, 3, 4, 5)))
    println(multiplicaPares(listOf(1, 3, 5)))
}

fun multiplicaPares(lista: List<Int>): Int {
    return lista.filter { it % 2 == 0 }.reduce { acum, iter -> acum * iter }
}
