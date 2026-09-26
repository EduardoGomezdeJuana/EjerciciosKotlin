
fun main(){
    inmutableList()
    mutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    println("Operaciones sobre inmutableList")
    println("size: " + readOnly.size)
    println(readOnly)
    println("primero: " + readOnly[0])
    println("primero: " + readOnly.first())
    println("ultimo: " +readOnly.last())

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
    println("Recorrer mutableList")
    if(weekDays.isEmpty()) {
        //No escribe nada
    }else{
        weekDays.forEach{println(it)}
    }
    println("")

    if(weekDays.isNotEmpty()){
        weekDays.forEach{println(it)}
    }
    println("")

    println("ultimo: " + weekDays.last())

}