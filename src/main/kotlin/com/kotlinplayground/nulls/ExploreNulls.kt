package org.example.com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String
) {

}

fun printName(name: String) {
    println("Name is $name")
}

fun printName2(name: String?) {
    println("Name is $name")
}

fun main() {
    var nameNullable : String? = null
    // printName(nameNullable!!) // throws a nullpointer exception
    // Scope functions solves calling a function that takes a non nullable type from a nullable type
    nameNullable?.run {
        printName(this)
    }

    if (nameNullable != null) {
        println("Value is ${nameNullable.length}")
    }
    // Kotlin way similar to typescript (java does not have this Save operator)...
    println("Value is ${nameNullable?.length}")
    //nameNullable = "Alex"
    val len = nameNullable?.length?.toLong() ?: 0 // Elvis operator provide default value
    println("length is ${len}")


    nameNullable = "Kei"
    println(nameNullable)

    var name : String = "Kei"
    printName2(name) // This works as when a function takes a non nullable variable that is passed to a nullable parameter
    // name = null     does not work not allowed as non nullable

    val movie = Movie(null, "xxxx")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!)  // non null assertion (!!) in kotlin in case id is null
    println("Saved movie $savedMovie")
}

fun saveMovie(m: Movie): Movie {
    return m
    //return m.copy(id = 1)
}
