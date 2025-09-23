package com.example.tema11.lambdaPersonalizado

//Define una función llamada funcionMatematica, que dada un parámetro Int
// y un parámetro lambda, devuelva ese número tras aplicarle esa operación lambda.

//parametros: numero int y un lambda q pide un numero (el priemr int) y devuelve una operacion (que se escribe en el main) con ese numero
fun funcionMatematica(numero: Int, operacion: (Int) -> Int): Int {
    //devolvemos el lambda (el cual pide el numero) por lo que da un Int que es lo que hay que devolver
    return operacion(numero)
}

fun main() {
    //en el parametro pongo la oparacion a realizar con el numero (tambien pasado por parametro)
    println(funcionMatematica(5, { it + 10 }))
}