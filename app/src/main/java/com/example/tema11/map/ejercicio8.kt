package com.example.tema11.map

fun main() {
    var listaNumeros = listOf(1, -5, 0)
    print(transformarNumeros(listaNumeros))
}

fun transformarNumeros(lista: List<Int>): List<String> {
    return lista.map {
        if (it > 0) "+$it"
        else if (it > 0) "$it"
        else "0"
    }
}