
fun main(){
    inmutableList()
    mutableList()
    integerList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    println("Operaciones sobre inmutableList")
    println("size: " + readOnly.size)
    println(readOnly)
    println("primero: " + readOnly[0])
    println("primero: " + readOnly.first())
    println("ultimo: " + readOnly.last())

    // Filtrar la lista
    val example1 = readOnly.filter{ it.contains("a") }
    println("filter: dias que contienen 'a': " + example1)

    // Ejemplo de reduce concatena separado por '-'
    val example2 = readOnly.reduce{ acc, dia -> "$acc - $dia" }
    println("reduce: dias concatenados con '-': " + example2)

    // Ejemplo de map convierte a mayusculas
    val example3 = readOnly.map{ dia -> dia.reversed() }
    println("map: dias invertidos: " + example3)
    println("")

    //Recorrer inmutableList
    println("Recorrer inmutableList")
    readOnly.forEach{println(it)}
    println("")
    readOnly.forEach{weekDay -> println(weekDay)}
    println("")

    // ERROR readOnly.add("Eduardo")
}

fun mutableList(){

    println("Operaciones sobre mutableList")
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")
    println("Añadir elemento por el final")
    weekDays.add("Eduardo")
    println(weekDays)
    println("")
    println("Añadir elemento en posicion 0")
    weekDays.add(0,"Eduardo")
    println(weekDays)
    println("Borrar ultimo elemento")
    weekDays.removeLast()
    println(weekDays)
    println("")

    // Recorrer mutableList
    println("Recorrer mutableList con forEach")
    if(weekDays.isEmpty()) {
        //No escribe nada
    }else{
        weekDays.forEach{println(it)}
    }
    println("")

    println("Recorrer mutableList con forEach")
    if(weekDays.isNotEmpty()){
        weekDays.forEach{println(it)}
    }
    println("")

    println("Ultimo elemento: " + weekDays.last())
    println("")
}

fun integerList(){

    //Ejemplos con lista de numeros
    val numeros = mutableListOf(1, 2, 3, 4, 5)
    println("Ejemplos con lista de numeros: " + numeros)

    val cuadrados = numeros.map { numero -> numero * numero }
    println("Cuadrados map: " + cuadrados)
    val pares = numeros.filter { numero -> numero % 2 == 0 }
    println("Pares filter: " + pares)
    val sumared = numeros.reduce { acc, numero -> acc + numero }
    println("Suma reduce: " + sumared)
    val ordenados = numeros.sortedByDescending { numero -> numero }
    println("Ordenados sortedByDescending: " + ordenados)
    val porParidad = numeros.groupBy { numero -> if (numero % 2 == 0) "par" else "impar" }
    println("Map groupBy: " + porParidad)
    val suma = numeros.sum()
    println("Suma sum(): " + suma)
    val maximo = numeros.max()
    println("Maximo max(): " + maximo)
    val minimo = numeros.min()
    println("Minimo min(): " + minimo)
    val promedio = numeros.average()
    println("Promedio average(): " + promedio)
    val unicos = numeros.distinct()
    println("Valores unicos distinct(): " + unicos)
    val primeroMayorQueTres = numeros.find { it > 3 }
    println("Primero mayor 3 find{ it > 3 }: " + primeroMayorQueTres)
    val hayNegativos = numeros.any { it < 0 }
    println("Hay negativos find{ it < 0 }: " + hayNegativos)
    val totalDoble = numeros.sumOf { it * 2 }
    println("Total dobles sumOf{ it * 2 }: " + totalDoble)
    println("")

    //Definición de funciones de extensión
    fun List<Int>.duplicar(): List<Int> {
        return this.map { it * 2 }
    }

    val duplicados = numeros.duplicar()
    println("Duplicados por funcion de extension: " + duplicados)

}