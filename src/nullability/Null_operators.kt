package nullability

fun main(){

    val a: Int ?= 8

    val b : Int = 10

    println(a?.plus(b))
    println(a?.minus(b))
    println(a?.div(b))
}