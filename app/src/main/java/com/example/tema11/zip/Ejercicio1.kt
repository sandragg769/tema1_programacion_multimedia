package com.example.tema11.zip

//emparejar nombres y edades
//Dadas dos listas, empareja los elementos y muestra frases tipo "Ana tiene 20 años".
fun main() {
    val nombres = listOf("Ana", "Luis", "Marta", "Pedro")
    val edades = listOf(20, 25, 22)

    // zip combina ambas listas en pares (nombre, edad)
    val combinados = nombres.zip(edades)

    // Mostrar resultado
    combinados.forEach { (nombre, edad) ->
        println("$nombre tiene $edad años")
    }
}