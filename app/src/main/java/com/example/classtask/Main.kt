package com.example.classtask
fun main() {
    val name: String = "Raghad"
    val num: Int = 2
    val num2 : Double = 4.0
    val yes: Boolean = true

    println("Hello my name is $name")

    val animals = listOf("cat", "dog", "Lion")
    println("arrays animals: $animals")

    val numbers = mutableListOf(1, 2, 3, 4)
    println("arrays number is\n$numbers")
    numbers.add(5)
    println("after adding number 5\n$numbers")

//if-else expressions.
    if (num%2==0){
        println("the number is even")
    }else{
        println("the number is odd")
    }
    sum(5,10)
    val ruslt = subtract(20,10)
    println("the subtract using lambda expression is $ruslt")
}

fun sum (num: Int,num1: Int){
    println("The summation is ${num + num1}")
}
// a lambda expression
val subtract: (Int,Int) -> Int = {x: Int, y: Int -> x-y}
