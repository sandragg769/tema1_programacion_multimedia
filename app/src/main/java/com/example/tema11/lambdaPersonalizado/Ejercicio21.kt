package com.example.tema11.lambdaPersonalizado

//Crea una función llamada procesarPares, que reciba una lista de números y debe:
//    • Verificar que todos los números de la lista sean pares.
//    • En caso de ser todos pares debe multiplicar cada uno de ellos por 4 y devolver la lista modificada.
//    • En caso de no ser todos pares se debe calcular el cubo de cada número y devolver la lista modfiicada.
//    • En caso de recibir una lista vacía devuelve null.

//gracias a los "?" la lista puede devolverse vacía o meterse vacía
fun procesarPares(lista: List<Int>?): List<Int>? {
    //comprobar que la lista no está vacía, si lo está devuelve null
    if (lista.isNullOrEmpty()) return null

    //verificar si TODOS (all) los números son pares
    val paresaONo = lista.all { it % 2 == 0 }

    //ahora creamos el lambda al que se le pasa un numero (lo que seria el it) y devuelve un numero ya calculado
    //importante multiplicar por 4 si todos son pares, si no, se devuelve el cubo
    val operacion: (Int) -> Int = if (paresaONo) {
        //poner llaves entre llaves por lass llaves del if y del propio lambda
        { n -> n * 4 }
    } else {
        { n -> n * n * n }
    }

    //una vez verificado y operado devolvemos la lista iterando el lambda con cada numero de la lista
    return lista.map { operacion(it) }
}

//hacerlo con switch (when)
fun procesarPares2(lista: List<Int>?): List<Int>? {
    val paresaONo = lista?.all { it % 2 == 0 }
    when {
        lista.isNullOrEmpty()-> return null

    }
}

fun main() {
    //todos pares
    val lista1 = listOf(2, 4, 6)
    //todos impares
    val lista2 = listOf(1, 3, 5)
    //pares e impares mezclados
    val lista3 = listOf(2, 3, 4)
    //probamos que funcione vacío
    val lista4 = emptyList<Int>()

    println(procesarPares(lista1)) // [8, 16, 24]
    println(procesarPares(lista2)) // [1, 27, 125]
    println(procesarPares(lista3)) // [8, 27, 64]
    println(procesarPares(lista4)) // null
}