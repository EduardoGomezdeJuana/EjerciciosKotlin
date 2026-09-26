
fun main(){
    inmutableList()
    mutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    println("1--\n")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.first())
    println(readOnly.last())

    // Filtrar la lista
    println("2--\n")
    val example = readOnly.filter{it.contains("a")}
    println(example)

    println("3--\n")
    val ejemplo = readOnly.reduce{ acc, dia -> "$acc - $dia"}

    //Recorrer la lista
    readOnly.forEach{println(it)}
    readOnly.forEach{weekDay -> println(weekDay)}

    // ERROR readOnly.add("Eduardo")
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")
    weekDays.add("Eduardo")
    println(weekDays)
    weekDays.add(0,"Eduardo")
    println(weekDays)

    if(weekDays.isEmpty()) {
        //No escribe nada
    }else{
        weekDays.forEach{println(it)}
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach{println(it)}
    }

    println(weekDays.last())
}