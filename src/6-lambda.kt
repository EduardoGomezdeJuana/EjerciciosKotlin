fun main(){

    // Ejemplos de expresiones lambda
    val lsuma = { a: Int, b: Int -> a + b }
    val lresta: (Int, Int) -> Int = { a, b -> a - b }
    val resultadoSuma = lsuma(10, 5)
    val resultadoResta = lresta(10, 5)

    println("Suma como lambda")
    println(resultadoSuma)
    println("Resta como lambda")
    println(resultadoResta)

    // Lambda con varias lineas
    println("Lambda con varias lineas")
    val suma: (Int, Int) -> Int = { a, b ->
        val resultado = a + b
        println("La suma de $a y $b es $resultado")
        resultado
    }
    println(suma(5,6))

    // Palabre reservada it
    val cuadrado: (Int) -> Int = { it * it }
    val resultadoCuadrado = cuadrado(5)
    println("Palabra reservada it")
    println(resultadoCuadrado)
}

