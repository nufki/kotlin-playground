package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main () {
    val list = listOf("Kei", "Ben", "Chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map{ it.uppercase() }
        .toList()   // Terminal operator

    println(list)

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    exploreFilterUsingSequence(courseList(), devPredicate)

    // Demo when processing as sequence is very useful
    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach{
            println("Value is: $it")
        }


}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate : (Course) -> Boolean) {
    val devCourses = courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("Courses: $it")
    }
}
