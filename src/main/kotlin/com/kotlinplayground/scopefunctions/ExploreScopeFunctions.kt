package org.example.com.kotlinplayground.scopefunctions

import org.example.com.kotlinplayground.classes.Course
import org.example.com.kotlinplayground.classes.CourseCategory


// CHeckout: https://kotlinlang.org/docs/scope-functions.html
fun main () {
    exploreApply()
    exploreAlso()
    chain()
    exploreLet()
    exploreWith()
    exploreRun()
}

// Run is useful if you do object initialization and computation of a return value
fun exploreRun() {
    println("exploreRun")
    // run as an extension function
    var numbers : MutableList<Int>? = null
    val ret = numbers.run {
        numbers =  mutableListOf(1,2,3)
        numbers?.sum() // Return value
    }
    println(ret)

    // run used without the context object
    val l = run {
        val name = "Kei"
        println(name)
        name.length
    }
    println("Print len $l")

}

fun exploreWith() {
    println("exploreWith")
    val numbers = mutableListOf(1,2,3,4,5)

    var res = with(numbers){
        print("Size of this list is ${numbers.size}")
        println("Size of this list is ${size}") // Or implicitily this is set same with the others below e.g. plus(6)
        val newlist = numbers.plus(6)
        newlist.sum()  // Lambda return
    }
    println("The result is: $res")
}

fun exploreLet() {
    println("exploreLet")
    val numbers = mutableListOf(1,2,3,4,5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()  // Return lambda result
    }
    println(result)

    var name : String? = null
    name = "Kei"
    val res1 = name?.let {    // Let block will only be executed if name is non null
        println(it)
        it.uppercase()
    }
    println(res1)
}

fun exploreApply() {
    println("exploreApply")
    val course = Course(1, "Blablabla", "Kei").apply {
        courseCategory = CourseCategory.DESIGN
        // this.courseCategory = CourseCategory.DESIGN or like that
    }
    println(course)
}

// Use also for Additional effects not object initialization
fun exploreAlso() {
    println("exploreAlso")
    val course = Course(1, "Blablabla", "Kei")
        .also {
      println(it)
    }
}

fun chain() {
    println("chain")
    val course = Course(1, "Blablabla", "Kei")
        .apply {
        courseCategory = CourseCategory.DESIGN
    }.also {
        println(it)
    }
}