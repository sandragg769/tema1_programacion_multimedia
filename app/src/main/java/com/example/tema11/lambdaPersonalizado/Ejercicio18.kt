package com.example.tema11.lambdaPersonalizado


// Define las siguientes expresiones lambda en variables
//    a) Calcula el cubo de un número.
//    b) Transforma una cadena de mayúscula a minúscula e invócala pasando como parámetro una lista de palabras usando la función map que recibe una lambda como parámetro.

//hacer una funcion que pida como parametro la lista y el lambda y devuelva la lista con erl lambda aplicado a cada pasada
fun procesarCadena(lista: List<String>, operacion: (String) -> (String)): List<String> {
    return lista.map { operacion(it) }
}

fun main() {
    //NO SE PUEDE USAR IT
    val calcularCubo: (Int) -> Int = { num -> num * num * num }

    val mayusAMinus: (String) -> String = { palabra -> palabra.lowercase() }

    println(calcularCubo(3))
    val listaMayus = listOf("SANDRA", "CARMEN", "ISA")
    val listaMinus = procesarCadena(listaMayus, mayusAMinus)
    println(listaMinus)

}