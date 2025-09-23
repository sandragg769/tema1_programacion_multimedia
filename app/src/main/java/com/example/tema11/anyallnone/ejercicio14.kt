package com.example.tema11.anyallnone


//Define una función que reciba una lista de contraseñas y compruebe si al menos una contiene un número.

fun contrasenasUnNumero(lista: List<String>): Boolean {
    //hacer un any dentro de un any para que recorra la palabra y vaya viendo si son digitos
    return lista.any { it.any { caracter -> caracter.isDigit() } }
    //OTRAS FORMAS
    //cualquier caracter, las veces que sea (o, 1 o mas) despues el digito, y despues otra vez lo que sea
    //lista.any { it.matches (".*\\d.*"))}
    //lista.any {it.contains (Regex("\\d"))}
}


fun main() {
    //true
    var lista = listOf("Alba1", "Lorena", "Oscar")
    println(contrasenasUnNumero(lista))
    //false
    var lista2 = listOf("Alba", "Lorena", "Oscar")
    println(contrasenasUnNumero(lista2))
}
