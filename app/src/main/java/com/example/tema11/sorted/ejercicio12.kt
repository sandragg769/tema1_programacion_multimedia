package com.example.tema11.sorted

import com.example.tema11.filter.empiezaVocal

//Define una función que ordene las palabras por orden alfabético descendente (de la Z a la A), pero previamente filtra
// las que empiecen por vocal, utilizando la función implementada anteriormente.
fun main() {
    var lista = listOf("Alba", "Lorena", "Oscar")
    print(ordenarDescendentemente(lista))
}

fun ordenarDescendentemente(lista: List<String>): List<String> {
    //metodo q pide la lista y con la lista q devuelve hacer el sorted
    return empiezaVocal(lista).sortedDescending()
}