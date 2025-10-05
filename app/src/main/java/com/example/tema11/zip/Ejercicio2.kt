package com.example.tema11.zip

//Fusionar listas de precios y productos
//Crea una lista con formato "Producto - Precio€".
fun main() {
    val productos = listOf("Manzana", "Pera", "Melón", "Sandía")
    val precios = listOf(1.2, 1.5, 2.3, 3.0)

    val listaFinal = productos.zip(precios) { prod, precio -> "$prod - ${precio}€" }

    println(listaFinal)
}
