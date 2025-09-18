package com.example.tema11.map

fun main() {
    var lista = listOf(5, -6, 0)
    print(transformarNumeros(lista))

}

fun transformarNumeros(listaEnteros: List<Int>): List<String> {
    return listaEnteros.map {
        //si es positivo +
        if (it > 0) "+$it"
        else "0"
    }
}