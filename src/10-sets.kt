
fun main(){
    inmutableSet()
    mutableSet()
    integerSet()
}
fun inmutableSet() {
    val ifrutas = setOf("platano", "manzana", "melon", "melon")

    println("Elementos en set inmutable: "+ ifrutas.count())
    println("Set inmutable: " + ifrutas)
    println("cereza in frutas: " + ("cereza" in ifrutas))
    println("")
}

fun mutableSet() {
    val mfrutas = mutableSetOf("platano", "manzana", "melon", "melon")

    println("Elementos en set mutable: " + mfrutas.count())
    println("Set mutable: "+ mfrutas)
    println("Añadimos cereza: ")
    mfrutas.add("cereza")
    println("Set mutable: " + mfrutas)
    println("Borramos melon: ")
    mfrutas.remove("melon")
    println("Set mutable: " + mfrutas)
    println("cereza in frutas: " + ("cereza" in mfrutas))
    println("")
}

fun integerSet(){
    val numeros = setOf(1, 2, 3, 4, 5)
    val numerosPares = setOf(2, 4, 6, 8, 10)
    val numerosImpares = setOf(1, 3, 5, 7, 9)

    println("Numeros: $numeros")
    println("Numeros pares: $numerosPares")
    println("Numeros impares: $numerosImpares")
    val union = numeros union numerosPares              // [1, 2, 3, 4, 5, 6, 8, 10]
    println("Union de pares e impares: $union")
    val interseccion = numeros intersect numerosImpares // [1, 3, 5]
    println("Numeros comunes con impares intersect: $interseccion")
    val diferencia = numeros subtract numerosPares      // [1, 3, 5]
    println("Numeros que no son pares subtract: $diferencia")
    val diferenciaSimetrica = (numeros union numerosPares) subtract (numeros intersect numerosPares) // [1, 3, 5, 6, 8, 10]
    println("Diferencia simetrica: $diferenciaSimetrica")

    val contieneTodos = numeros.containsAll(setOf(1, 2))    // true: {1, 2} es subconjunto de numeros
    println("Numeros contiene (1,2): $contieneTodos")
    val contieneAlguno = numerosPares.any { it in numeros } // true
    println("Numeros contiene algun numero par: $contieneAlguno")
    val sonDisjuntos = numerosPares.none { it in numerosImpares } // true
    println("Numeros pares e impares son disjuntos: $sonDisjuntos")
    val esVacio = numeros.isEmpty()
    println("Numeros es vacío: $esVacio")
    print("")

    println("Recorrer numeros con for:")
    for (numero in numeros) {
        println(numero)
    }
    println("Recorrer numeros con forEach:")
    numeros.forEach { numero ->
        println(numero)
    }
}
