
fun main(){
    inmutableMap()
    mutableMap()
    integerMap()
}

fun inmutableMap() {
    // Mapas inmutables
    val iDays: Map<String, Int> = mapOf(
        "Lunes" to 1,
        "Martes" to 2,
        "Miércoles" to 3,
        "Jueves" to 4,
        "Viernes" to 5,
        "Sábado" to 6,
        "Domingo" to 7
    )
    println("Mapa inmutable: " + iDays)

    // Iterar usando un bucle for
    println("Recorrer el mapa inmutable con for")
    for ((dia, numero) in iDays) {
        println("El dia $dia es el dia $numero de la semana.")
    }
    println("")
}

fun mutableMap() {
    val mDays:MutableMap<String, Int> = mutableMapOf(
        "Lunes" to 1,
        "Martes" to 2,
        "Miércoles" to 3,
        "Jueves" to 4,
        "Viernes" to 5,
        "Sábado" to 6,
        "Domingo" to 7
    )
    println("Mapa Mutable: " + mDays)
    mDays["Festivo"]=0
    println("Mapa Mutable con nuevo elemento 0")
    println(mDays)
    println("Recorrer el mapa mutable con forEach")
    mDays.forEach{ (clave, valor) ->
        println("Dia: $clave, numero: $valor")}
    println("")
}

fun integerMap(){
    val enteros = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println("Mapa de integer sin modificaciones: " + enteros)
    enteros["uno"] = 10     // Modifica el valor de una clave existente
    enteros["cuatro"] = 4   // Añade un nuevo par
    enteros.remove("dos")
    println("Mapa de integer modificado: " + enteros)
    println("")

    println("Recorrer el mapa con for")
    for ((clave, valor) in enteros) {
        println("Clave: $clave, Valor: $valor")
    }

    println("Recorrer el mapa con forEach")
    enteros.forEach { (clave, valor) ->
        println("Clave: $clave, Valor: $valor")
    }

    val valorUno = enteros.get("uno")
    println("Obtiene el valor asociado a una clave get(\"uno\"): $valorUno")
    val contieneDos = enteros.containsKey("dos")
    println("Comprueba si una clave está presente en el mapa containsKey(\"dos\"): $contieneDos")
    val contieneCinco = enteros.containsValue(5)
    println("Comprueba si un valor está presente en el mapa containsValue(5): $contieneCinco")
    val claves = enteros.keys
    println("Obtiene las claves del mapa keys: $claves")
    val valores = enteros.values
    println("Obtiene los valores del mapa values: $valores")
    val numerosPares = enteros.filterKeys { clave -> clave.length % 2 == 0 }
    println("Filtra el mapa por las claves filterKeys length par: $numerosPares")
    val numerosImpares = enteros.filterValues { valor -> valor % 2 != 0 }
    println("Filtra el mapa por los valores filtervalues numeros impares: $numerosImpares")

}


