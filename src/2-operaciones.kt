// Variables

fun main(){
    /**
     * Variables numéricas
     */
    // Int -2,147,483,647 a 2,147,483,647
    val integer1:Int = 30
    var integer2 = 40
    println("Sumar $integer1 + $integer2:")
    println(integer1 + integer2)
    print("")

    println("Restar $integer1 - $integer2:")
    println(integer1 - integer2)
    print("")

    println("Multiplicar $integer1 * $integer2:")
    println(integer1 * integer2)
    print("")

    println("Dividir $integer1 / $integer2:")
    println(integer2 / integer1)
    print("")

    println("Módulo $integer1 % $integer2:")
    println(integer1 % integer2)
    print("")

    // Float
    val float1:Float = 30.5f
    println("Sumar $integer1 + $float1:")
    println (integer1 + float1)
    var nuevo1 = integer1 + float1
    println("Este es el nuevo float = $integer1 + $float1:")
    println(nuevo1)
    print("")

    //Conversion de tipos
    var nuevo2 = integer1 + float1.toInt()
    println("Este es el nuevo integer = $integer1 + $float1.toInt:")
    println(nuevo2)
    print("")

    //String
    val string1 = "23"
    val string2 = "5"
    println("Este es string $string1 + $string2:")
    println(string1 + string2)
    println("Este es integer $string1.toInt() + $string2.toInt():")
    println(string1.toInt() + string2.toInt())
    print("")

    //Para reemplazar valor de variables con $variable
    println("Hola tengo $integer1 años")
    val string3:String = integer1.toString()
    println("$string3 ni en broma!!")
    print("")
}