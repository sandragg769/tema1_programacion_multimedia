package com.example.tema11

fun main() {
    val lista = listOf(1, 2, 3, 4)
    print(sumaPositivos(lista))
}

fun sumaPositivos(lista: List<Int>): Int {
    return lista.reduce { acum, it -> acum + it }
}