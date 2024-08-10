package org.example.com.kotlinplayground.classes

import com.kotlinplayground.CourseJava

data class Course(
    val id : Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)


enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

// Instructs the Kotlin compiler to generate overloads for this function that substitute default parameter values.
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

fun main() {
    val course = Course(1, "Blablabla", "Kei")
    println(course)

    val course1 = Course(1, "Blablabla", "Kei")
    println(course1)

    println("Checking object equality: ${course == course1}") // True as equal is implemented

    val course3 = course1.copy(id = 3, author = "Kei1") // Copy (clone) is offered out of the box when using data class
    println(course3)

    val marketing = Course(1, "Blablabla", "Kei", CourseCategory.MARKETING)
    println(marketing)

    val courseJava = CourseJava(2, "Facebook Marketing","Kei Nufer")
    println("courseJava = $courseJava")
    courseJava.id = 4
    courseJava.name = "xxxx"
    println("courseJava = $courseJava")
}