package org.example.com.kotlinplayground.classes

open class User(val name: String){
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("Inside user login")
    }

    private fun secret() {
        println("Inside user login")
    }

    protected open fun logout() {
        println("Inside user login")
    }

}

class Student(name: String) : User(name){
    override var isLoggedIn: Boolean = false
    override fun login() {
        println("Inside Student login")
        super.login()
    }

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    public override fun logout() {
        super.logout()
        println("Inside student login")
    }
}

class Instructor(name: String) : User(name){

}

fun main () {
    val student = Student("Alex")
    println("Student is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Loggged in value is ${student.isLoggedIn}")
    student.logout()

    val country = Student.country()
    println("Country is $country")

    println("No enrolled courses ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Kei")
    println("Instructor is ${instructor.name}")
    instructor.login()

    val user = User("Alex")
    // user.secret  not accessable
}


