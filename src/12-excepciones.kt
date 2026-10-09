
fun main() {
    val dato1 = 1
    capturarExcepcion(dato1)
    val dato2 = "Hola"
    capturarExcepcion(dato2)
    println("El programa continúa")
}

fun capturarExcepcion(dato: Any) {
    try {
        val numero = dato.toString().toInt()
        println("El dato es número $numero")
    } catch (e: NumberFormatException) {
        println("$dato no es un número válido")
    }
}






