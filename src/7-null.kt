
fun main() {
    var name1:String? = "Hola"
    var name2:String? = null

    println(name1?.get(3) ?: "Es nulo")
    println(name2?.get(3) ?: "Es nulo")
    println(name1!!.get(3) ?: "Es nulo")
}

