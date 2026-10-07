
fun main() {
    var name1:String? = "Hola"
    var name2:String? = null

    println("No es nulo y devuelve valor:")
    println(name1?.get(3) ?: "Es nulo")
    println("El operador elvis escribe \"Es nulo\" por ser nulo:")
    println(name2?.get(3) ?: "Es nulo")
    println("No lanza excepcion por no ser nulo:")
    println(name1!!.get(3) ?: "Es nulo")

    println("Longitud de $name1:")
    imprimirLongitud(name1)
    imprimirLongitud(name2)
    name1?.let { println("El nombre tiene ${it.length} letras") }
    println("Este no se ejecuta por ser nulo")
    name2?.let { println("El nombre tiene ${it.length} letras") }

    println("Lanza excepcion por ser nulo:")
    println(name2!!.get(3))
}

fun imprimirLongitud(texto: String?) {
    if (texto != null) {
        println("fun imprimirLongitud: " + texto.length) // Aquí texto ya es de tipo String
    } else {
        println("fun imprimirLongitud: No hay texto")
    }
}
