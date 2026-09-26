fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 0 || age > 100 -> -1  // Invalid age
        age <= 12 -> 15              // Children's ticket
        age in 13..60 -> if (isMonday) 25 else 30 // Adult ticket with Monday discount
        age >= 61 -> 20              // Senior ticket
        else -> -1                   // This line should not be reached
    }
}

