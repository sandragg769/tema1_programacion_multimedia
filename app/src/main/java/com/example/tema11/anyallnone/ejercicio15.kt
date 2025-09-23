package com.example.tema11.anyallnone

//Define una función que compruebe que todas las contraseñas tengan al menos 8 caracteres y
// contengan al menos 2 números. Pista: Usar función count para contar caracteres que cumplan ser dígito.

fun contrasenaSegura(lista: List<String>): Boolean {
    return lista.all { it.length >= 8 && it.count { caracter -> caracter.isDigit() } >= 2 }
    //OTRA FORMA DE HACERLO
    //en vez de caracter.isDigit(), it.count (Char::isDigit) >=2
}

fun main() {
    //true
    var lista = listOf("aaaaaa11", "aaaaaa11", "aaaaaa11")
    println(contrasenaSegura(lista))
    //false (ninguna cumple)
    var lista2 = listOf("aaaaaaaa", "aaaaaaaa", "aaaaaaaa")
    println(contrasenaSegura(lista2))
    //false (cumple una)
    var lista3 = listOf("aaaaaaa11", "aaaaaaaa", "aaaaaaaa")
    println(contrasenaSegura(lista3))
}

