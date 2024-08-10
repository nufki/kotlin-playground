package org.example.com.kotlinplayground.interfaces

import org.example.com.kotlinplayground.classes.Course


// Simplify the handling normally interfaceas and concrete implementations are in separate files
interface CourseRepository {
    val isCoursePersisted: Boolean

    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("Course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

interface A {
    fun doSomething() {
        println("doSomething A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething AB")
    }
}

class SQLCourseRepository: CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Blablabla", "Kei")
    }

    override fun getAll(): Any {
        return 1
    }

    override fun save(course: Course): Int {
        this.isCoursePersisted = true
        return super.save(course)
    }

}

class NoSQLCourseRepository: CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Blablabla", "Kei")
    }

    override fun save(course: Course): Int {
        println("Course is nosqlCourseRepository $course")
        return course.id
    }

}

fun main () {
    val sqlCourseRepository = SQLCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is ${course}")
    val courseId = sqlCourseRepository.save(Course(5, "meeeee", "Kei Nufer"))
    println("Saved course: $courseId")

    println("Course persisted value ${sqlCourseRepository.isCoursePersisted}")

    val noSqlCourseRepository = NoSQLCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println("Course is ${course1}")
    val savedCourseId = sqlCourseRepository.save(Course(6, "meeeee", "Kei Nufer"))
    println("Saved course in noSQLCourseRepository: $savedCourseId")

    val ab = AB()
    ab.doSomething()
}