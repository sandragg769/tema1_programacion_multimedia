package com.example.tema11.anyallnone

//Define una función que compruebe que ninguna contraseña pueda contener un espacio.

fun contrasenaNoEspacios(lista: List<String>): Boolean {
    return lista.none { it.any { caracter -> caracter.isWhitespace() } }
}


fun main() {
//true (ninguna tiene espacio)
    var lista = listOf("aaaaaa11", "aaaaaa11")
    println(contrasenaNoEspacios(lista))
    //false (una tiene espacio)
    var lista2 = listOf("aaaaaa 11", "aaaaaa11")
    println(contrasenaNoEspacios(lista2))
    //false (todas tienen espacio)
    var lista3 = listOf("aaaaaa 11", "aaaaaa 11")
    println(contrasenaNoEspacios(lista3))
}
