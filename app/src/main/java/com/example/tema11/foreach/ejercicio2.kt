package com.example.tema11.foreach

fun main() {
    var listaNumeros = listOf(1, 5, 8, 3, 10)
    val cantidad = contarMayoresQue(listaNumeros, 5)
    println(cantidad)
}

//poner el :Int al final
fun contarMayoresQue(lista: List<Int>, limite: Int): Int {
    var cont = 0
    //"filtramos"
    lista.forEach { if (it > limite) cont++ }
    return cont
}