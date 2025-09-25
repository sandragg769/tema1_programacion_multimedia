package com.example.tema11.poo

import com.example.tema11.foreach.contarMayoresQue

// Crea un sistema simple para gestionar vehículos. Debes implementar una clase Coche (marca, modelo, año)
// y una clase Concesionario (nombre). El concesionario debe permitir la agregación de coches a su concesionario.
// Para ello, coches será una lista que se inicializa vacía en la clase Concesionario.
fun main() {
    val c1 = Coche("Toyota", "Corolla", 2020)
    val c2 = Coche("Ford", "Focus", 2018)
    val c3 = Coche("Tesla", "Model 3", 2023)
    var lista=mutableListOf<Coche>(c1,c2,c3)

    val concesionario = Concesionario("Autos Juan", lista)




}