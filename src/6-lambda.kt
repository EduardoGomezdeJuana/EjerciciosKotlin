fun main(){

val resultado1 = sumar (1,2,3)
    println(resultado1)
    val resultado2 = sumar (1,2,3,8,9)
    println(resultado2)

    val suma: (Int, Int) -> Int = { a, b ->
        val resultado = a + b
        println("La suma de $a y $b es $resultado")
        resultado
    }

    println(suma(5,6))
}

fun sumar(vararg numeros: Int): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}