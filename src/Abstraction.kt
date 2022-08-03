
 fun main (){

   //val a1 = Animal()
     val d1 = Dog()
     d1.eat()
     d1.walk()
     d1.name = "tyson"
     println(d1.name)
     d1.crouch()



 }

 abstract class Animal {

     abstract  var name : String

     abstract fun walk ()

     open fun eat (){
         println("Animal is eating")


     }

     fun crouch (){
         println("Animal is crouching")
     }
 }

      class Dog : Animal() {
          override  var name: String = "kks"



          override fun walk() {
              println("oh yeah")
          }

         override  fun eat (){
             println("dogs eats a a lot")
          }


      }