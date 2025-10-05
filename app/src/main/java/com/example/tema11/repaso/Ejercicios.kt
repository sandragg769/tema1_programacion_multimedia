package com.example.tema11.repaso

import com.example.tema11.map.transformarNumeros

fun contarMayoresQue(listaEnteros: List<Int>, limite: Int): Int {
    return listaEnteros.count { it > limite }
}

fun ej1(lista: List<String>) {
    lista.forEach { println("Hola ${it.uppercase()}") }
}

fun filtrarPalabrasLargas(lista: List<String>): List<String> {
    return lista.filter { it.length > 4 }
}

fun palabrasempiezanVocal(lista: List<String>): List<String> {
    //poner el Char
    return lista.filter { it[0].uppercaseChar() in listOf<Char>('A', 'E', 'I', 'O', 'U') }
}

fun filtrarParesPositivos(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 != 0 && it >= 0 }
}

fun calcularPreciosFinales(lista: List<Double>, impuesto: Double = 0.21): List<Double> {
    return lista.map { it * (1 + impuesto) }
}

fun capitalizarNombres(lista: List<String>): List<String> {
    return lista.map { it.lowercase().replaceFirstChar { it.uppercase() } }
}

fun transformarNumeros(numeros: List<Int>): List<String> {
    return numeros.map {
        when {
            it > 0 -> "+$it"
            it < 0 -> "$it"
            else -> "0"
        }
    }
}





