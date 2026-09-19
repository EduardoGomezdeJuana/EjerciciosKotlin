// Variables
fun main(){
    /**
     * Variables numéricas
     */
    // Int -2,147,483,647 a 2,147,483,647
    val integer1:Int = 30
    var integer2 = 40
    println("integer1: " + integer1)
    println(integer2)
    println("")

    // Long
    val long1:Long = 30
    val long2 = 30  // Por defecto es tipo Int
    println("long1: " + long1)
    println("long2: " + long2::class.simpleName + " " + long2)
    println("")

    // Float
    val float1:Float = 30.5f
    println("float1: " + float1)
    println("convertido a int: " + float1.toInt())
    println("")

    // Double
    val double1:Double = 3241.5566
    println("double1: " + double1)
    println("")

    /**
     *  Variables alfanuméricas
     */
    val char1:Char = '2'
    val char2 ='@'

    /**
     * String
     */
    val string1:String = "Eduardo"
    val string2 = "Eduardo Gomez"
    println(string2)
    print("")

    /**
     * Boolean
     */
    val boolean1:Boolean = true
    val boolean2 = false

    println(boolean2)

}