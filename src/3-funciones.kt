// Variables de ámbito de clase y de función

fun main(){
    println("fun ShowMyName(name)")
    ShowMyName("Eduardo")
    println("")
    println("fun ShowMyAge(currentAge):Int =30")
    println("fun ShowMyAge(35)")
    ShowMyAge(35)
    println("")
    println("fun ShowMyAge()")
    ShowMyAge()
    println("")
    println("fun Suma(76, 25)")
    Suma(76,25)
    println("")
    println("fun Resta1(18, 5):Int")
    val n3 = Resta1(18, 5)
    println(n3)
    println("fun Resta2(n1, n2):Int = n1 - n2")
    val n4 = Resta2(18, 5)
    println(n4)
    println("")
    println("fun Sumar(1,2,3)")
    val resultado1 = Sumar (1,2,3)
    println(resultado1)
    println("fun Sumar(1,2,3,8,9)")
    val resultado2 = Sumar (1,2,3,8,9)
    println(resultado2)
    println("")
    println("fun operacion(10, 5, ::sum)")
    val resultadoSuma = operacion(10, 5, ::sum)
    println(resultadoSuma)
    println("fun operacion(10, 5, ::rest)")
    val resultadoResta = operacion(10, 5, ::rest)
    println(resultadoResta)
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

// Return
fun Resta1(n1:Int, n2:Int):Int{
    return n1 - n2
}
// Puede abreviarse con una expresion
fun Resta2(n1:Int, n2:Int):Int = n1 - n2

// Numero variable de argmentos
fun Sumar(vararg numeros: Int): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

// Función como parametro a otra funcion
fun operacion(a: Int, b: Int, funcion: (Int, Int) -> Int): Int {
    return funcion(a, b)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun rest(a: Int, b: Int): Int {
    return a - b
}



