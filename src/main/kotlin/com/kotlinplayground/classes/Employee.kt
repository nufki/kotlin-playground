package org.example.com.kotlinplayground.classes

data class Employee(val id: Int, val name: String) {

}

fun main() {
    val employee1 = Employee(1, "John")
    println(employee1)

    val employee2 = Employee(1, "John")
    println("Compare: ${employee1 == employee2}")

    val employee3 = employee2.copy(2, "Kei")
    println(employee3)
}