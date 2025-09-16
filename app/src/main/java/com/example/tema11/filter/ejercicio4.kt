package com.example.tema11.filter

fun main() {
    var lista = listOf("Alba", "Lorena", "Oscar")
    print(empiezaVocal(lista))

}

fun empiezaVocal(palabras: List<String>): List<String> {
    //se pueden tratar como si fuesen array
    return palabras.filter { it[0].lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') }
}