package com.example.tema11.zip

//Comparar notas de alumnos
//Muestra si cada alumno ha subido, bajado o mantenido su nota.
fun main() {
    val alumnos = listOf("Juan", "Ana", "Pedro", "Lucía")
    val notas1 = listOf(7, 5, 9, 4)
    val notas2 = listOf(6, 8, 9, 7)

    val comparacion = notas1.zip(notas2)

    /*alumnos.zip(comparacion).forEach {
        (nombre, (n1, n2)) ->
        val resultado = when {
            n2 > n1 -> "subió"
            n2 < n1 -> "bajó"
            else -> "igual"
        }
        println("$nombre: $resultado")
    }*/
}