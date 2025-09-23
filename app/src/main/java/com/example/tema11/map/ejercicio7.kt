package com.example.tema11.map

//Define una función capitalizarNombres que recibe una lista de nombres completos en minúsculas y devuelve una
// lista donde cada nombre esté capitalizado (primera letra en mayúscula y el resto en minúscula).
fun capitalizarNombres(listaNombres: List<String>): List<String> {
    //poner todas las letras minusculas pero cambiando la primera de it por mayuscula
    return listaNombres.map { it.lowercase().replaceFirstChar { it.uppercase() } }
}


fun main() {
    var lista = listOf("alba", "lorena", "oscar")
    print(capitalizarNombres(lista))
}
