package com.example.tema11

fun main() {
var lista= listOf("Alba","Lorena","Oscar")

}

fun empiezaVocal(palabras: List<String>): List<String> {
    //se pueden tratar como si fuesen array
    palabras.filter { it [0] in listOf('a','e','i','o','u') }
    return  palabras
}