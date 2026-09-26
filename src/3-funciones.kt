// Variables de ámbito de clase y de función

fun main(){
    println("fun ShowMyName(name):")
    ShowMyName("Eduardo")
    println("")
    println("fun ShowMyAge(currentAge):")
    ShowMyAge(35)
    println("")
    println("fun ShowMyAge():")
    ShowMyAge()
    println("")
    println("fun Suma(n1, n2):")
    Suma(76,25)
    println("")
    println("fun Resta1(n1, n2):Int:")
    val n3 = Resta1(18, 5)
    println(n3)
    println("fun Resta2(n1, n2):Int = n1 - n2:")
    val n4 = Resta2(18, 5)
    println(n4)

}

fun ShowMyName(name:String){
    println("Me llamo $name")
}

// Valor por defecto
// fun ShowMyAge(currentAge:Int = 30){
fun ShowMyAge(currentAge:Int =30){
    println("Tengo $currentAge años")
}

fun Suma(n1:Int, n2:Int){
    println(n1 + n2)
}

fun Resta1(n1:Int, n2:Int):Int{
    return n1 - n2
}
// Puede abreviarse más
fun Resta2(n1:Int, n2:Int):Int = n1 - n2
