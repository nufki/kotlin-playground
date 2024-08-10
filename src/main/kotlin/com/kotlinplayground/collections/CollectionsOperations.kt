package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main () {

    val courseList = courseList()
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN}
    exploreFilter(courseList, designPredicate)
    exploreMap(courseList, designPredicate)

    val list = listOf(listOf(1,2,3), listOf(4,5,6))

    val mapResult = list.map {
        outerList ->
            outerList.map {
                it.toDouble()
            }
    }
    println("mapResult: $mapResult")

    val flatmapResult = list.flatMap {
            outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("flatmapResult: $flatmapResult")

    val courses = exploreFlatMap(courseList, KAFKA)
    println("courses: $courses")

    exploreHashMap()
    collections_nullability()

}

fun collections_nullability() {
    var list : MutableList<String>? = null   // Nullable collections
    list = mutableListOf()
    list.add("Kei") // Save operator is mandaotry as the collection is nullable
    list.forEach {
        println("Value is $it")
    }
    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach { println("Value is : ${it?.length}") }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Kei" to 43, "Scooby" to 5)
    nameAgeMutableMap
        .forEach{(k,v) ->
            println("key = $k, value = $v)")
        }

    // get
    val value = nameAgeMutableMap.get("Kei")  // use indexing operator ["Kei] instead of .get
    println("Value is $value")

    // getOrElse
    val value2 = nameAgeMutableMap.getOrElse("Kei2") {"abc"}  // use indexing operator ["Kei] instead of .get
    println("Value is $value2")

    // containsKey
    val value3 = nameAgeMutableMap.containsKey("Kei")
    println("Value is $value3")

    // filterKeys
    val filteredMap = nameAgeMutableMap
        .filterKeys { it.length > 5 }
        .map { it.key.uppercase() }

    println("Value is $filteredMap")

    // maxOfOrNull
    val maxAge = nameAgeMutableMap
        .maxOfOrNull { it.value }
    println("Max age: $maxAge")

}

fun exploreFlatMap(courseList: MutableList<Course>, topic: String): List<String> {
    val topicCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered
            .filter { it == topic }
            .map { courseName }
    }
    return topicCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map {
        "${it.name} - ${it.category}"
    }.forEach {  // When doing a foreach the courses returns unit
        println(it)
    }
    println("Courses: $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate : (Course) -> Boolean) {
    val devCourses = courseList.filter {
        // it.category == CourseCategory.DEVELOPEMENT
        predicate.invoke(it)
    }.forEach {
        println("devCourses: $it")
    }
}
