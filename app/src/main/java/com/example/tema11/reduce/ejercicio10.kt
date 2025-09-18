package com.example.tema11.reduce

fun main() {
    println(multiplicaPares(listOf(1, 2, 3, 4, 5)))
    println(multiplicaPares(listOf(1, 3, 5)))
}

fun multiplicaPares(lista: List<Int>): Int {
    return lista.filter { it%2==0 }.reduce { acum,iter -> acum*iter }
    }
