package org.example.com.kotlinplayground.basics

fun main() {
    // if-else
    // when

    var name = "Alex"
    name = "Chloe"
    if (name.length == 4) {
        println("Name is Four Characters")
    }
    else {
        println("Name is not Four Characters")
    }


    val result = if (name.length == 4) {
        println("Name is Four Characters")
        name.length // Last statement is the return
    }
    else {
        println("Name is not Four Characters")
        name.length
    }
    println("Result length is $result")

    // IF/ELSE BLOCK
    /*
    val position = 2
    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    }
    else {
        "NO MEDAL"
    }
    println(medal)
     */

    // When block simplifies
    val position = 1
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)
}