fun main() {
    ifAnidado("dog")
    ifMultiple("dog")
}

fun ifAnidado(pet: String) {
    if (pet == "dog") {
        println("Es un perro.")
    } else if (pet == "cat") {
        println("Es un gato.")
    } else if (pet == "bird") {
        println("Es un pájaro.")
    } else {
        println("No es ninguno.")
    }
}

fun ifMultiple(pet: String) {
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)) {
        println("Es un perro o un gato feliz.")
    }
}
