package com.example.tema11.poo

//no es una clase de data solo ya que hay algo de lógica, hay que añadir cosas
class Concesionario(
    var nombre: String,
    var listaCoches: MutableList<Coche>
)
//definimos la funcion de añadir coches
{
    fun agregarCoches(coche: Coche) {
        listaCoches.add(coche)
    }

    //Aprovecha las clases anteriores y añade un metodo a Concesionario
    // llamado agruparPorMarca, que permita agrupar los coches por marca.
    fun agruparPorMarca(): Map<String, List<Coche>> {
        return listaCoches.groupBy { it.marca }
    }
}