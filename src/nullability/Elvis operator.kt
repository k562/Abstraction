package nullability

fun main(){

//    val a : String ?= null
//    val b = a?:"Aarvi"



    val a : String ?= "Aarvi"
    val b = a?: "Thankyou sir"

    println(b.length)
}
