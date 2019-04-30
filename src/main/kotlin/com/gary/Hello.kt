package com.gary

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()

    val age = 12
    var age2 : Int = 13;
    age2 = age2.plus( age )
    println( age2 )

}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}