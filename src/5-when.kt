
fun main() {
    getMonth(3)
    getTrimester(3)
    getSemester(3)
    result(true)
    result(8)
    result("Hola")
    println(getResult1(3))
    println(getResult2(6))
    println(getResult3(8))
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("noviembre")
        }

        12 -> println("diciembre")
        else -> println("error")
    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
        else -> println("error")
    }
}

fun getSemester(month: Int) {
    when (month) {
        in 1..6 -> println("primer semestre")
        in 7..12 -> println("segundo semestre")
        !in 1..12 -> println("error")
    }
}

fun result(value: Any) {
    when (value) {
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if (value) println("Es verdadero")
    }
}

fun getResult1(month: Int): String {
    val result = when (month) {
        in 1..6 -> "primer semestre"
        in 7..12 -> "segundo semestre"
        else -> "error"
    }
    return result
}

fun getResult2(month: Int): String {
    return when (month) {
        in 1..6 -> "primer semestre"
        in 7..12 -> "segundo semestre"
        else -> "error"
    }
}

fun getResult3(month: Int) = when (month) {
        in 1..6 -> "primer semestre"
        in 7..12 -> "segundo semestre"
        else -> "error"
}