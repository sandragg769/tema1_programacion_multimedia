package com.example.tema11.sorted

// Define una función que ordene una lista de palabras por su longitud, de más pequeña a más grande.
fun main() {
    var lista = listOf("Alba", "Lorena", "Oscar")
    print(ordenarLonguitud(lista))
}

fun ordenarLonguitud(lista: List<String>): List<String> {
    return lista.sortedBy { it.length }
}