
fun main(){

    // Indice 0-6, tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles","Jueves","Viernes", "Sábado","Domingo")
    println(weekDays[3])
    println(weekDays.size)

    //Modificar valores
    weekDays[0]="Feliz lunes"
    println(weekDays[0])

    //Bucles para arrays
    for(position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, values) in weekDays.withIndex()){
        println("La posición $position es $values")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")

    }    }