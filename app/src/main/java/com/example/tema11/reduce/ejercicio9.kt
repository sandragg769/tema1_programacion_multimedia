package com.example.tema11.reduce

//Define una función sumaPositivos, que reciba una lista de enteros y devuelva la suma de los números positivos de dicha lista.
fun main() {
    val lista = listOf(1, 2, 3, 4, -3)
    print(sumaPositivos(lista))
}

fun sumaPositivos(lista: List<Int>): Int {
    //declarar acum e it pq si no no va el reduce
    return lista.filter { it > 0 }.reduce { acum, it -> acum + it }
}