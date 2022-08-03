package nullability

import java.lang.NullPointerException

fun main (){

    try {

        val a : String ?= null

        println(a!!.length)
    } catch (e : NullPointerException){

        val a : String ?= null
        println(a?.length)

    } finally {
        val a  : String ?= "kks"
        println(a?.length)
    }
    
}