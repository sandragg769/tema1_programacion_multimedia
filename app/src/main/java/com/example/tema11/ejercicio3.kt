package com.example.tema11

fun main() {
    var lista = listOf("holaa", "hola", "holaaa")
    //pilla q es lista
    val resultado = filtrarPalabrasLargas(lista)
    println(resultado)
}

fun filtrarPalabrasLargas(palabras: List<String>): List<String> {
    return palabras.filter { it.length > 4 }
}