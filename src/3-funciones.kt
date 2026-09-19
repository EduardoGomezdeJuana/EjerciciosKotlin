// Variables de ámbito de clase y de función

fun main(){
    ShowMyName("Eduardo")
    ShowMyAge(30)
    Sum(76,25)
    val n3 = Rest(18, 5)
    println(n3)
}

fun ShowMyName(name:String){
    println("Me llamo $name")
}

// Valor por defecto
// fun ShowMyAge(currentAge:Int = 30){
fun ShowMyAge(currentAge:Int){
    println("Tengo $currentAge años")
}

fun Sum(n1:Int, n2:Int){
    println(n1 + n2)
}

fun Rest(n1:Int, n2:Int):Int{
    return n1 - n2
}
// Puede abreviarse más
//fun Rest(n1:Int, n2:Int):Int = n1 - n2
