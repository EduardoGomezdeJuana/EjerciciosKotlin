// Variables

fun main(){
    /**
     * Variables numéricas
     */
    // Int -2,147,483,647 a 2,147,483,647
    val integer1:Int = 30
    var integer2 = 40
    println("Sumar:")
    println(integer1 + integer2)

    println("Restar:")
    println(integer1 - integer2)

    println("Multiplicar:")
    println(integer1 * integer2)

    println("Dividir:")
    println(integer2 / integer1)

    println("Módulo:")
    println(integer1 % integer2)

    // Float
    val float1:Float = 30.5f
    println(integer1 + float1)
    var nuevo1 = integer1 + float1
    println("Este es float:")
    println(nuevo1)

    //Conversion de tipos
    var nuevo2 = integer1 + float1.toInt()
    println("Este es integer:")
    println(nuevo2)

    //String
    val string1 = "23"
    val string2 = "5"
    println("Este es string:")
    println(string1 + string2)
    println("Este es integer:")
    println(string1.toInt() + string2.toInt())

    //Para reemplazar valor de variables con $variable
    println("Hola tengo $integer1 años")
    val string3:String = integer1.toString()
    println("$string3 ni en broma!!")
}