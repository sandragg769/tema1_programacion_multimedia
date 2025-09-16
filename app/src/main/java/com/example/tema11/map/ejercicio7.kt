package com.example.tema11.map

import com.example.tema11.filter.empiezaVocal

fun main() {
    var lista = listOf("alba", "lorena", "oscar")
    print(capitalizarNombres(lista))

}

fun capitalizarNombres(listaNombres: List<String>): List<String> {
    //poner todas las letras minusculas pero cambiando la primera de it por mayuscula
    return listaNombres.map { it.lowercase().replaceFirstChar { it.uppercase() } }
}

