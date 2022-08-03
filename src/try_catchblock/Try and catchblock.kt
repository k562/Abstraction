package try_catchblock

import java.lang.ArithmeticException

fun main (){

    val array = arrayOf<Int>(2,4,5,6,6)

    try {
      array[5] = 56

    } catch (e1: ArrayIndexOutOfBoundsException){

        println("Print the final one")
    } finally {

        array[1] = 44
        println(array[1])
    }

   val a = 9
    val b = 0


    try {
        println(a/b)
    } catch (e1: ArithmeticException){

    } finally {
        println(a + b)
    }



}