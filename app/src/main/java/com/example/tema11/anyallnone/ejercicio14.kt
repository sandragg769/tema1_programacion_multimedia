package com.example.tema11.anyallnone

import com.example.tema11.sorted.ordenarDescendentemente

//Define una función que reciba una lista de contraseñas y compruebe si al menos una contiene un número.
fun main() {
    //true
    var lista = listOf("Alba1", "Lorena", "Oscar")
    print(contraseñasUnNumero(lista))
    //false
    var lista2 = listOf("Alba", "Lorena", "Oscar")
    print(contraseñasUnNumero(lista2))
}

fun contraseñasUnNumero(lista: List<String>): Boolean {
    //hacer un any dentro de un any para que recorra la palabra y vata viendo si son digitos
    return lista.any { it.any { caracter -> caracter.isDigit() } }
}