package com.example.tema11

fun main() {
    //hacer lista, con el listOf pilla que es lista
    val nombres = listOf("Marta", "Carlos", "Juan")
    for (nombre in nombres) {
        println("Hola ${nombre.uppercase()}")
    }

}