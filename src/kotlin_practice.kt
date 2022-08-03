import java.util.*

fun main() {

    // The hello world program

    //  println ("Hello kotlin")

// print("Kaushik karan  ")
//    println("Singh")

    // Data types

//    var x : Int =  10
//    println(x)
//
//    var y : Char = 'K'
//    println(y)
//
//    var a :  Boolean =  true
//    println(a)
//
//
//    var b :  String = "Aarvi kashyap"
//    println(b)
//
//    var c :  Double = 1238.354
//    println(c)
//
//    var d :  Float = 123.465f
//     println(d)

//
//    var name : String =  "Kaushik karan singh"
//
//    var age : Int =  20
//
//    var birth :  Double =  1999.0
//
//
//    println("==== User info ====")
//
//    println("Name : $name")
//    println("Age : $age")
//    println("DOB: $birth")


    // The operators  :-

    // The arithmetic operators :-

//     var x :  Int =  20;
//
//     var y :  Int = 10;
//
//      println(x+y)
//      println(x-y)
//      println(x*y)
//      println(x/y)
//      println(x%y)

    // The assignment operators  :-

//          var x  =  24;
//
//            x+= x
//            println(x)
//            x+=24
//            println(x)
//            x -= 45;
//             println(x)
//            x *=46;
//             println(x)
//             x /= 6
//             println(x)

    // The flow controll :-

    // The if statement

// var age = 23;
// if (age <= 34) {
//  println("You can have your driving license")
// }
//
    // The if else Statement :-

//    var age = 12;
//  if (age>=20){
//    println("You can have your driving license")
//  } else {
//   println("Other wise you dont have your driving licesnse ")
//  }

    // The nested if else statement :-  or If-else ladder


// println("Enter your grade")
// var grade : Int = readLine()!!.toInt()
//
//   if (grade in  90..100){
//    println("A+")
//   } else if ( grade in 80 ..89){
//    println('A')
//   } else if (grade in 70..79){
//    println('B')
//   } else if (grade in 60..69){
//    println('C')
//
//   } else if (grade in 50..59){
//    println('D')
//   } else  if ( grade in 40..49){
//    println("Need to be improvement ")
//   }

    // The when statement :-

// println("Enter your fooId: ")
// var foodId : Int = readLine()!!.toInt()
//
// when (foodId){
//
//  1  ->  {
//   println("You ordered sandwhich")
//  }
//
//  2 -> {
//   println("You ordered Maggie")
//  }
//
//  3 -> {
//   println("You ordered Chow mine")
//  }
//  4 -> {
//   println("You odered hotdog")
//  }
//
//  else -> {
//   println("You ordered nothing")
//  }
//
// }

    // println("Enter your number:  ")
// var grade : Int=  readLine()!!.toInt()
//
//
//   when{
//    grade in 91..100 -> {
//     println ("A+")
//    }
//    grade in 81..90 -> {
//     println("B ")
//    }
//       grade in 71..80 -> {
//           println("C")
//       }
//       grade in 61..70 -> {
//           println("D")
//       }
//       else -> {
//           println("Ypu failed")
//       }
//   }


    // The Relational operator :-

//    var x = 23;
//    var y = 45
//    println(x>y)
//    println("Enter your number:  ")
//
//    var x: Int = readLine()!!.toInt()
//    println("Enter your number: ")
//
//    var y: Int = readLine()!!.toInt()
//    println(x==y)

    // The logical operator :-
    // AND operator :- &&

    /* T && T = T
      T && F = F
      F && T = F
      F && F = F  */


//    var age = 20
//    println(age>=20 && age<=15)


    // The OR operator  ||
    /*    T || T = T
        T || F = T
        F || T = T
        F || F = F */


//    var age = 34;
//    println(age>=20 || age<=15)


    // The NOT  Operator :-
//    !(T) = F
//    !(F) = T

//    var grade = 50
//    println(!(grade==50))


    // The loops

    // For loop :-

//    for ( i : Int in 1 .. 10 step 1){
//        println("The number is: $i" )
//
//    }

//    for (i: Int in 100 downTo 1 step 2){
//        println("Count down even number: $i")
//    }

    // While loop :-

//    var i = 1
//    while(i<=10){
//        println("The number is $i")
//        i++
//    }
//    var i = 20
//    while(i>=1){
//        println("Count down even number: = $i")
//        i-=2
    // }

// Do while loop :-

//    var i = 1
//    do{
//        println("The number is: $i")
//        i++
//    } while (i<=20)


//var arrayString = arrayOf<String>("Aarvi","kaushik", "Roshan")
//    println(arrayString[0])

//    var arrayInt = arrayOf<Int>(3,343,24,32,34,4,5,543,4,234,32,43)
//
//    println(arrayInt.size)

//    var arrayChar= arrayOf<Char>('r','3','6','9')

    // Strings :-

//    var Stringname = "kasuhik karan singh"
//    println(Stringname.length)
//
//    var Stringname2 = "Aarvi kashyap"
//    println(Stringname2.get(4))
//
//    var Stringname3 =  "Aarvi kashyap"
//    println(Stringname3.subSequence(3,7))

    // Arrray function:-

//    var Intarray = arrayOf<Int>(23,3,324,3,43,4,234345,2)
//    println(Intarray.size)


    // Print all the elements in a array in a kotlin :-

//    var Array_char = arrayOf<Char>('e','r','2','t','t','o')
//    println(Arrays.toString(Array_char))

//  var c =  arrayOf<Int>(23,32,34,34,4668,32,98)
//    println(c[4])

    // Lists:-

//    list are of two types :-
//    1) Immutable list - whos value cannot be changed or having fixed values.
//
//    2) Mutable list =  Who's value can be changed ,change and add the elements:-


//    var s = arrayListOf<String>("box","Bed","chair","laptop")
//
//    s[2]="blackboard"
//    s.add("Tv")
//
//    println(s)


// Functions:-

//     println(sayHey())

    //  Break and continue statement :-

//   for (i:Int in 1..10 step 1){
//      if (i==6){
//         break
//      }
//
//      println("The number will stop at 5  :  $i")
//   }

    // for Continue statement
    // write a programe to print all eben numbers:-

//   for (i: Int in 1..11 step 1){
//      if (i%2!=0){
//         continue
//      }
//      println("Print all even numbers: $i")
//   }

//    var x = arrayListOf<Int>(23, 3, 34, 23, 4, 3, 2, 34, 23, 34)
//
//    x[2]=100
//    x.add(45)
//    println(x)


    // Question :- Hello world program


    //   println("Hello kotlin")


    // Question program to add two numbers:-

//    println("Enter your first number : ")
//    var x : Int = readLine()!!.toInt()
//
//    println("Enter your seconf number: ")
//    var y: Int = readLine()!!.toInt()
//
//    var sum : Int = x+y
//
//    println("Sum of two numbers is: $sum")


    // Question :- Swap two number using third variable !!!

//    var x  = 12
//
//    var y =  24
//
//    var temp = x
//
//     x =  y
//
//    y = temp
//
//  println("The value of x is:  $x")
//  println("The value of y is:  $y")


    // Question : -  Write a program to swipe number without using the third variable ;


//  println("The value of x:  ")
//  var x : Int =  readLine()!!.toInt()
//
//  println("The value of y: ")
//  var y : Int = readLine()!!.toInt()
//
//  x -= y
//
//  y += x
//
//  x  = y - x
//
//  println("The value of x: $x")
//
//  println("The value of y: $y")


    // question make number swipe :-


    // Question swap number with without having 3rd variable :-


//  println("Enter your firdt number: ")
//  var x  : Int = readLine()!!.toInt()
//
//  println("Enter you second number: ")
//  var y: Int = readLine()!!.toInt()
//
//
//  x -= y
//
//  y += x
//
//  x =  y - x
//
//
//  println(x)
//
//  println(y)


    // User info by taking input :-

//  println("Enter your name: ")
//  var name : String =  readLine()!!.toString()
//
//  println("Enter your age: ")
//  var age : Int =  readLine()!!.toInt()
//
//  println("==== User Info====")
//  println("Your name is : $name")
//  println("Your age  is : $age")

//   var age : Int = 40
//
//   when(age){
//
//     10 -> println("You entred school ")
//     20 -> println("you entyred collage ")
//     30 -> println("You entered office")
//     40 -> println("You entered vacation")
//     50 -> println("you entred nothing")
//
//   }

    // if else

//  var age =20
//
//  if (age> 20){
//    println("You can drive ")
//  } else if (age <10){
//    println("You can drive but cycle ")
//
//  } else {
//    println("You can drive nthing ")
//  }


    // For loop :-

//  for (i : Int in 1..10 ){
//    println("Print numbers : $i")
//  }


    // part 2 :-

//  for (i: Int in 1..100 step 3){
//    println("Print even numbers : $i")
//  }

    // while loop :-

//  var i : Int = 1
//  while (i<=10){
//    println("Print number: $i")
//    i++
//
//  }

    // Do while loop

//  var i : Int = 1
//  do {
//      println(i)
//     i++
//  } while (i<=10)


//  for (i:Int in 100 downTo 1 step 1){
//    println(i)
//  }

//for (i: Int in 1..10 step 1){
//  if (i==5){
//    break
//  }
//  println("The number stop at 5 : $i")
//}


//  for (i: Int in 1..10 step 1){
//    if (i==5){
//      continue
//    }
//    println("The number will continue  : $i")
//  }

//  val age: Int =  20
//  println( (age>=20) &&  (age<20))


// val age = 20
//  println(age>=20 || age <20)

//    val age = 20
//  println(!(age == 20))


//  var sting_array  = arrayOf<String>("kks","Aarvi", "kaurvi")
//
//  println("Print the array string is : ${sting_array[2]}")

//  val int_arrays = arrayOf<Int>(12,34,34,23,434,234,3,4,45,5,3,45)
//  println(int_arrays[5])

//  val double_Array = arrayOf<Double>(23.4,54.54,3245.56,78.45)
//  println("Print the double array at index 2: ${double_Array[2]}")


    // lets create a fumction
    // hello()

    // println(timestwo(4))


    // println("say hey")


    //  println(" ==== Print all the even numbers ==== ")


//     for (i in 0 until 100 step 2) {
//         println("  $i ")
//     }


    // class conectionmanger {
//
// }

//    var x =  24
//
//    x++
//
//    var y = x+10
//
//    println("The sum is $y")


//    println("Enter your name")
//    var name = readLine()!!.toString()
//
//    println("Enter your age")
//    var age = readLine()!!.toInt()
//
//
//    println("Enter your birth")
//    var birth = readLine()!!.toDouble()
//
//
//
//    println("==== User info =====")
//    println("Your name is $name")
//    println("Your age is $age")
//    println("Your birth is $birth")


    // For loop practice


//    for(i in 0 until 100 step 2){
//
//        println("Print $i")
//    }

    // Reverse for loop
//    for (i in 100 downTo 0 step 2 ){
//        println("Print even no $i")
//    }

    // While loop


//    var i: Int = 0
//    while (i <= 100) {
//        println("Print no's $i")
//        i++
//
//
//    }



     // Do while loop
//
//    var i =  10
//    do {
//        println("print $i")
//        i++
//
//    } while (i <= 100)

//    var food_id  = 4

//    when(food_id){
//
//        1 -> {
//        println("Oder pizza")
//
//
//    }
//
//        2 -> {
//            println("order chowmin")
//
//        }
//
//        3 -> {
//            println("order maggie")
//        }
//
//        4 -> {
//            println("order mechronics")
//        }
//
//    }



}

