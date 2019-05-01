package com.gary.student

import java.util.*

fun main(args: Array<String>) {
    println("Please enter student's name : ")
    var scanner = Scanner( System.`in` )
    val name = scanner.next()

    println("Please enter student's English score : ")
    val english = scanner.nextInt()

    println("Please enter student's Math score : ")
    val math = scanner.nextInt()

    val stu = Students(name, math, english)
    stu.print()
}

class Students(var name : String , var math : Int, var english :Int){
    fun print(){
        println(name + "\t" + math + "\t" + english + "\t" + ( english + math)/2 )
    }
}