//file:JvmName("Course") Specific to Kotlin e.g. without the Kt such that it can be used within Java by the name Course
package org.example.com.kotlinplayground.classes

import com.kotlinplayground.CourseJava


// Default value solution
//data class Course
//    @JvmOverloads
//    constructor(
//    val id : Int,
//    val name: String,
//    val author: String,
//    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
//) {

data class Course(
    val id : Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
){
    var noOfCourses = 10

    @JvmField
    var asField = 10

    // Company does not directly have a concept of static function but it has companion object
    companion object {

        fun printName2(name: String = "default") {
            println("name: $name")
        }

        @JvmStatic
        fun printNameAsStatic(name: String = "default") {
            println("name: $name")
        }

    }
}




enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

//@JvmName("printName2")
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
//    courseJava.keyListList
    println("courseJava = $courseJava")
}