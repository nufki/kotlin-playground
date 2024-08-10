package org.example.com.kotlinplayground.basics

import org.example.com.kotlinplayground.functions.courseName
import org.example.com.kotlinplayground.functions.topLevelFunction

fun main() {
    val name: String = "Kei"
    println(name)
    var age = 20
    println(age)
    age = 33
    println(age)

    val salary = 30000L // Type inference
    println(salary)

    val course = "Kotlin Spring"
    println("Course: $course and the course length is ${course.length}") // String interpolation

    val multline = "ABC \n DEF"
    println(multline)

    // TripleQuotes strings
    val multline1 = """ 
        ABC
        EFG
    """.trimIndent()
    println(multline1)

    // Invoke function
    val num = topLevelFunction()
    println("Top Level Function Value: $num")

    println("Top Level Property: $courseName")


}