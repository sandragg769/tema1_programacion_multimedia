package com.example.tema11.map

fun main() {
    var lista = listOf("alba", "lorena", "oscar")
    print(capitalizarNombres(lista))
}

fun capitalizarNombres(lista: List<String>): List<String> {
return lista.map { it.replaceFirstChar { it.uppercase() } }
}