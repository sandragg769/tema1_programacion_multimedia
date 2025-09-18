package com.example.tema11

fun main() {
    var listaNumeros = listOf(1, 5, 8, 3, 10)
print(filtrarParesPositivos(listaNumeros))
}

fun filtrarParesPositivos(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}
