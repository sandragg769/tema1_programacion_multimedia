package com.example.tema11.lambdaPersonalizado
//  Crea una función llamada filtrarPorRango que reciba una lista de números, un valor mínimo y un valor máximo.
//  La función debe filtrar los números que estén entre minValue y maxValue (inclusive).

fun filtrarPorRango (lista: List<Int>, minimo: Int, maximo:Int): List<Int> {
    //lambda como una variable, le pasamos int y devuelve bool
    val rango: (Int) -> Boolean = { it in minimo..maximo }
    return lista.filter { rango }
}


fun main() {
    val numeros = listOf(1, 5, 10, 15, 20, 25)
    val resultado = filtrarPorRango(numeros, 10, 20)
    println(resultado)
}