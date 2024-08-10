package org.example.com.kotlinplayground.exceptions

fun main () {
    println("Name length ${nameLength("Kei")}")
    println("Name length ${nameLength(null)}")

    returnNothing() // Introducing the Nothing Type that always throws an Exception
}

fun returnNothing() : Nothing {
    throw RuntimeException()
}

fun nameLength(name: String?): Int? {
    // Try catch as an expression
    val result = try {
        name!!.length
    }catch (ex: Exception) {
        println("Exception is: $ex")
        null
    }

    return result
}
