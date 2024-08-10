package org.example.com.kotlinplayground.basics

fun main() {
    // Range (.. notation)
    val range = 1..10
    for (i in range) {
        println("i:  $i")
    }

    // Reverse range (with downto operator)
    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("reverseRange:  $i")
    }

    // Skip (with step operator)
    for (i in reverseRange step 2) {
        println("reverseRange with skip:  $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    println("exploreDoWhile")
    var i = 0
    do {
        println("Value of i is: $i")
        i++

    }while(i < 5)
}

fun exploreWhile() {
    println("exploreWhile")
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")
        x++
    }
}
