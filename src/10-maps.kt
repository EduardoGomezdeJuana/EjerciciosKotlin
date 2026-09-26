
fun main(){
    inmutableMap()
    mutableMap()
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
    print("I1-")
    println(iDays)
    print("I2-")

    // Iterar usando un bucle for
    for ((dia, numero) in iDays) {
        println("El dia $dia es el dia $numero de la semana.")
    }
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
    print("M1-")
    println(mDays)
    mDays["Festivo"]=0
    print("M2-")
    println(mDays)
    print("M3-")
    mDays.forEach{ (clave, valor) ->
        println("Dia: $clave, numero: $valor")}
}


