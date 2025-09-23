package com.example.tema11.concatenacionFuncionesLambda

//Crea una función llamada sumaPares que reciba dos enteros, inicio (por defecto 1) y fin (por defecto 10),
// y devuelva la suma de todos los números pares dentro de ese rango.
fun sumaPares(inicio: Int=1, fin: Int=10): Int {
    //entre parentesis para hacerlo lista
    val rango = (inicio..fin)
    return rango.filter { it % 2 == 0 }.reduce { acum, num -> acum + num }
    //.sum() para sumar, sin ponerle nada dentro, en vez de .reduce
}

fun main() {
    println(sumaPares(fin=20))
    println(sumaPares(inicio =5))
    println(sumaPares(fin=20, inicio = 10))
    println(sumaPares(1,10))
    println(sumaPares())
}