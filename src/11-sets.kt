
fun main(){
    inmutableSet()
    mutableSet()
}
fun inmutableSet() {
    val ifrutas = setOf("platano", "manzana", "melon", "melon")

    println(ifrutas.count())
    println(ifrutas)
    println("cereza" in ifrutas)
}

fun mutableSet() {
    val mfrutas = mutableSetOf("platano", "manzana", "melon", "melon")

    println(mfrutas.count())
    println(mfrutas)
    mfrutas.add("cereza")
    println(mfrutas)
    mfrutas.remove("melon")
    println(mfrutas)
    println("cereza" in mfrutas)
}
