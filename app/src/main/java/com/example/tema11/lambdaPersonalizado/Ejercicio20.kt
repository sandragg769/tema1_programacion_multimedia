package com.example.tema11.lambdaPersonalizado
//  Crea una función llamada filtrarPorRango que reciba una lista de números, un valor mínimo y un valor máximo.
//  La función debe filtrar los números que estén entre minValue y maxValue (inclusive).


fun filtrarPorRango(lista: List<Int>, minimo: Int = 1, maximo: Int = 10): List<Int> {
    //lambda como una variable, le pasamos int y devuelve bool para saber si está en el rango
    val rango: (Int) -> Boolean = { it in minimo..maximo }
    //al lambda hay que pasarle un Int asiq se pone como parametro it para que itere
    //devolvemos el filter (q es una lista) de la lista de numeros xviendo con el lambda si esta en el rango o no
    return lista.filter { rango(it) }
}

//hacerlo sin filter
//until en vez de .. para que no meta el ultimo en el rango
fun filtrarPorRango2(lista: List<Int>, minimo: Int = 1, maximo: Int = 10): List<Int>? {
    //hacer mutable para poder hacer add
    val listaNueva = mutableListOf<Int>()
    for (num in lista) {
        if (num in minimo..maximo) {
            listaNueva.add(num)
        }
    }
    return listaNueva
}


fun main() {
    val numeros = listOf(1, 5, 10, 15, 20, 25)
    val resultado = filtrarPorRango(numeros, 10, 20)
    println(resultado)
    val resultado2 = filtrarPorRango2(numeros, 10, 20)
    println(resultado2)
}