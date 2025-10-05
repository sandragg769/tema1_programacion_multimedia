package com.example.tema11.zip

//Sumar listas de números
//Crea una lista donde cada elemento sea la suma de los pares correspondientes.
fun main() {
    val lista1 = listOf(1, 2, 3, 4)
    val lista2 = listOf(10, 20, 30, 40)

    val sumaListas = lista1.zip(lista2) { a, b -> a + b }

    println(sumaListas)
}