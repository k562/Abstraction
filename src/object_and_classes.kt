//
//
//class bike {
//    var tyres : Int = 4
//    var headlight : Int = 1
//    var name : String = "Apache"
//
//
//    fun run(): Unit{
//        println("$name is running")
//    }
//
//    fun stand():Unit {
//        println("$name is standing")
//    }
//
//}
//
//fun main(){
//    val obj = bike()
//    obj.tyres = 5
//    obj.headlight = 2
//    obj.name = "pulser"
//    println("The bike has ${obj.tyres} tyres and ${obj.headlight} headlights its name is ${obj.name}")
//
//}




//class cat {
//    var age : Int = 2
//    var name : String = "Oggy"
//
//    fun walk(): Unit{
//        println("$name is walking")
//    }
//
//    fun sleep(){
//        println("$name is sleeping")
//    }
//}
//
//fun main(){
//    val c1 = cat()
//    c1.name = "Olive"
//    c1.age = 3
//    println("The cat name is ${c1.name}")
//    println("The cat age is ${c1.age}")
//
//    c1.sleep()
//    c1.walk()


//  class cat {
//
//      var legs  =  4
//      var name : String =  "Olive"
//      var furr : Boolean = true
//
//
//     fun walk(){
//         println("$name is walking")
//     }
//
//      fun eat(){
//          println("$name is eating")
//      }
//
//  }
//
//  fun main () {
//
//      val cat1 =  cat()
//
//      println("The cat has ${cat1.legs} legs and her name is ${cat1.name} and she is has a brown fair and its ${cat1.eat()}")
//
//  }

  class Cat {

      val name : String ?="Olive"
      val age : Int = 6
      val hasfur : Boolean = true


      fun drink ():Unit{

          println("$name is drinking")
      }

      fun walk ():Unit{
          println("$name is drinking")
      }
  }


      fun main(){

          val cat1 = Cat()
          println("I am having cat her name is ${cat1.name} and her age is ${cat1.age} and has brownfur and its ${cat1.hasfur}")


      }



