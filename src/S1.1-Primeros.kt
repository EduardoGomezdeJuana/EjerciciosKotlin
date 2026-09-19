fun main(){
    Impuestos("PAN",0.6f,0)
    Impuestos("LECHE",1.0f,10)
    Impuestos("GASOIL",1.4f,15)
}

fun Impuestos(name:String,precio:Float,porcentaje:Int){
    println(name + '-' + ((precio*porcentaje/100)+precio) + '-' + porcentaje + '%')
}