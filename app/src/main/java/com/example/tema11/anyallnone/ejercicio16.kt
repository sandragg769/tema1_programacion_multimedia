package com.example.tema11.anyallnone

//Define una función que compruebe que ninguna contraseña pueda contener un espacio.

fun contraseñaNoEspacios(lista: List<String>): Boolean {
    //sin ! devuelve true si tiene espacio, por eso hay que pinerselo pq es correcto (true) si no tiene
    return lista.none { it.any { caracter -> caracter.isWhitespace() } }
}


fun main() {
//true (ninguna tiene espacio)
    var lista = listOf("aaaaaa11", "aaaaaa11")
    println(contraseñaNoEspacios(lista))
    //false (una tiene espacio)
    var lista2 = listOf("aaaaaa 11", "aaaaaa11")
    println(contraseñaNoEspacios(lista2))
    //false (todas tienen espacio)
    var lista3 = listOf("aaaaaa 11", "aaaaaa 11")
    println(contraseñaNoEspacios(lista3))
}
