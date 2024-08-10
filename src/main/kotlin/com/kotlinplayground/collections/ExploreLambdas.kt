package org.example.com.kotlinplayground.collections

// op = variable of type function
fun calculate(x: Int, y: Int, op: (x: Int, y: Int)-> Int): Int {
    return op(x,y)
}

fun main() {
    val addLambda = {x: Int -> x + x}
    val addResult = addLambda(3)
    println("addResult:  $addResult")

    val multiplyLambda = {x: Int, y: Int ->
        println("x is $x, y is $y")
        x * y}
    val multiplyResult = multiplyLambda(2,3)
    println("multiplyResult:  $multiplyResult")

    // Higher Order functions
    val resultMultiply = calculate(2,3) { a, b -> a * b }
    println("result resultMultiply: $resultMultiply")

    val resultAdd = calculate(2,3) { a, b -> a + b }
    println("result resultAdd: $resultAdd")
}