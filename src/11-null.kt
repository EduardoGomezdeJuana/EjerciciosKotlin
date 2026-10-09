
fun main() {
    val name1:String? = "Hola"
    val name2:String? = null

    println("No es nulo y devuelve valor:")
    println(name1?.get(3) ?: "Es nulo")
    println("El operador elvis escribe \"Es nulo\" por ser nulo:")
    println(name2?.get(3) ?: "Es nulo")
    println("No lanza excepcion por no ser nulo:")
    println(name1!!.get(3) ?: "Es nulo")
    println("")

    println("Longitud de $name1:")
    println("fun imprimirLongitud(name1): " + imprimirLongitud(name1))
    println("Longitud de $name2:")
    println("fun imprimirLongitud(name2): " + imprimirLongitud(name2))
    println("")

    println("let: se ejecuta por no ser nulo")
    name1?.let { println("El nombre tiene ${it.length} letras") }
    println("let: este no se ejecuta por ser nulo")
    name2?.let { println("El nombre tiene ${it.length} letras") }
    println("")

    println("Función de extensión oLongitud de String null da 0")
    val nombre: String? = null
    println("oLongitud de $nombre: " + nombre.oLongitud()) // 0
    println("")

    println("Lanza excepcion por ser nulo:")
    println(name2!!.get(3))
}

// Smart cast
fun imprimirLongitud(texto: String?):String {
    if (texto != null) {
        return(texto.length.toString()) // Aquí texto ya es de tipo String
    } else {
        return("No hay texto")
    }
}

// Función de extensión
fun String?.oLongitud(): Int {
    return this?.length ?: 0
}


