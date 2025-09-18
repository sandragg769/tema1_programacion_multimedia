package com.example.tema11.foreach

//Dada una lista de nombres de usuarios, recórrela y muestra cada nombre en mayúsculas precedido por el String “Hola “.
fun main() {
    //hacer lista, con el listOf pilla que es lista
    val nombres = listOf("Marta", "Carlos", "Juan")
    nombres.forEach { println("Hola ${it.uppercase()}") }
}