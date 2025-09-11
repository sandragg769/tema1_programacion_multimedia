package com.example.tema11

fun main() {
    // se pone val y no se pone el tipo de dato, se podria poner num:Int (tipo de dato no se suele poner pero si se pone es en mayuscula)
    var num = 4.0
    //modificarf var
    num = 3.0

    //el val no se cambia donde empieza la lista, no sde piede hacer profesores=null ya que se cambia la direccion de memoria de profesores, pero sde puede añadir y eliminar elementos
    val profesores = mutableListOf("Javier", "Fran")
    println(profesores) //no hace falta foreach, e imprime bien sin la direccion de memoria

    //probamos la funcion
    //imprimirNombrer("Javier")

    //puedo poner una variable igualada a un metodo
    //val saludo= imprimirNombrer("JAVIER")
    //println(saludo)

    //poner el argumento con nombre
    val saludo2 = imprimirNombrer(nombre = "Marcos", saludo = "Hola")
    println(saludo2)

    //1..9 y hace el rango
    val rango = 1..9
    //recorrer lista
    //step salto
    //downTo de arriba a abajo??
    for (numero in rango step 2)
        println(numero)


    //tambien letras
    val letras = 'a'..'z'
    //val esta'r' in letras mira si r esta dentro de letras
    if ('r' in letras) {
        println("R esta dentro")
    }

    //tambien fechas
}


//poner tipo de dato en las funciones!!
//tipo de retorno, si es void no se pone nada, es redundante, en caso de poner algo despues del parametro : Unit, pero dicer que lo quite
//ponermos por defecto el valor de nombre
//para alterar elñ valor de los parametros, por ejemplo primero el nombre yt despues el saludo, basta con poner el nombre de la variable
fun imprimirNombrer(saludo: String = "Hola", nombre: String): String {
    return "$saludo $nombre"
}


//se puede obviar el {}
fun imprimirNombrer2(nombre: String) = "Hola $nombre"

//se puede igualar a una expresion simplemente
//si igualo  (=) ya no hace falta return!!
fun max(a: Int, b: Int): Int = if (a > b) a else b

//SWITCH
//en vez de switch se usa when
//val color = Color.AZUL
//when (color){
//se pueden poner varios casos que devuelvan lo mismo, igual q con string, "Si", "Yes", "S"...
//    Color.AZUL, Color.BLUE-> println("blue")
//    Color.ROJO->println("red")
//se pone else en vez de default
//    else -> println("diferente")
//}

//PUNTO 4
//nombre=null NO SE PUEDE no se puede pobner null en Kotlin
// para que se pueda hay q poner ? y para esto poner tipo de dato
// var nombre:String? = "Javier"
//nombre=null

//ELVIS
//se pone println(nombre?.length) el ? es para ahorrar el if de comprobacion de java para que no de exception
//siguiento con esto del ? safe con el elvis hace que en el else (el de que hago si es null)
//quedaria:
//val longitud = cadena?.length ?: 0 (en vez de que pongas el null pone 0)
//SI NO SE PONE ASÍ EN EL EXAMEN QUITA PUNTOS

//LET