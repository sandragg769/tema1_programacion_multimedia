package com.example.tema11.lambdaPersonalizado

// Define las siguientes expresiones lambda en variables
//    a) Calcula el cubo de un número.
//    b) Transforma una cadena de mayúscula a minúscula e invócala pasando como parámetro una lista de palabras usando la función map que recibe una lambda como parámetro.
fun main() {
    val calcularCubo: (Int) -> Int = { num -> num * num * num }

    val mayusAMinus: (String) -> String = { palabra -> palabra.lowercase() }

    println(calcularCubo(3))
    val lista = listOf("SANDRA", "CARMEN", "ISA")
    val resultado = lista.map(mayusAMinus)
    println(resultado)

}