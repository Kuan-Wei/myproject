package com.gary

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human( 66.5f, 1.7f )
    println( h.bmi() )

//    val age = 12
//    var age2 : Int = 13;
//    age2 = age2.plus( age )
//    println( age2 )

}

class Human(var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
    fun hello(){
        println("Hello kotlin")
    }
    fun bmi() : Float{
        var bmi = weight / ( height * height)
        return bmi;
    }
}