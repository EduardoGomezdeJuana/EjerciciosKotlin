fun main() {
    // Celsius to Fahrenheit conversion
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        9.0 / 5.0 * celsius + 32
    }

    // Kelvin to Celsius conversion
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    // Fahrenheit to Kelvin conversion
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        5.0 / 9.0 * (fahrenheit - 32) + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
