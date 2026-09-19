fun main() {
    println("IMC de 1.70m y 65kg: " + IMC(1.70f, 65))
    println("IMC de 1.70m y 65kg: " + IMCr(1.70f, 65))
}

fun IMC(altura:Float,peso:Int):Float{
    return altura * peso
}

fun IMCr(altura:Float,peso:Int):Float = altura * peso
