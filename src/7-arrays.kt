
fun main(){

    // Indice 0-6, tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles","Jueves","Viernes", "Sábado","Domingo")
    println("Posicion 3: " + weekDays[3])
    println("Size: " + weekDays.size)
    println("")

    //Modificar valores
    weekDays[0]="Feliz lunes"
    println("Posicion 0 modificada: " + weekDays[0])
    println("")

    //Bucles para arrays
    println("Recorrer el array con for position")
    for(position in weekDays.indices){
        println("[" + position + "] " + weekDays[position])
    }
    println("")

    //Interpolación de cadenas nativa de Kotlin utilizando el símbolo $
    println("Con interpolacion utilizando $")
    for(position in weekDays.indices){
        println("[$position] ${weekDays[position]}")
    }
    println("")

    println("Recorrer el array con for withIndex")
    for((position, values) in weekDays.withIndex()){
        println("La posición $position es $values")
    }
    println("")

    for (weekDay in weekDays){
        println("Ahora es $weekDay")

    }
    println("")

    println("Crea el array con expresion lambda")
    val cuadradosi = IntArray(5) { i -> i * i }
    println(cuadradosi.joinToString(" - "))
    println("Crea el array con expresion lambda it")
    val cuadradosit = IntArray(5) { it * it }
    println(cuadradosit.joinToString(" - "))
}