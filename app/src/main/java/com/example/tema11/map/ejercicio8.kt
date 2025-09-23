package com.example.tema11.map

//Define una función transformarNumeros, que transforme una lista de enteros en strings que:
//    1. Muestren un + delante si son positivos.
//    2. Mantengan el signo - si son negativos
//    3. Si es cero, que muestre "0".

fun transformarNumeros(listaEnteros: List<Int>): List<String> {
    return listaEnteros.map {
        //si es positivo +
        if (it > 0) "+$it"
        else "0"
    }
}

fun main() {
    var lista = listOf(5, -6, 0)
    print(transformarNumeros(lista))

}
