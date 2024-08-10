package org.example.com.kotlinplayground.cast

import org.example.com.kotlinplayground.classes.Course

fun main() {
    val course = Course(1, "Blablabla", "Kei")
    checkType(course)
    checkType("Kei")
    castNumber(1.1)
    castNumber(1)

    // castNumber(1) // class java.lang.Integer cannot be cast to class java.lang.Double

    val number = 1
    val numberDouble = number.toDouble()
    println("Number to Double: $numberDouble")
}

fun castNumber(any: Any) {
    when(any) {
        any as? Double -> {
            println("Value is Double")
        }
        any as? Int -> {
            println("Value is Int")
        }
    }

}

fun checkType(type: Any) {
    when (type) {
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase()) // Smart casting
        }
    }
}
