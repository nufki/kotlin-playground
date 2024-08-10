package org.example.com.kotlinplayground.functions

import java.time.LocalDate


fun addition(x: Int, y: Int): Int {
    return x+y
}

fun additionApproach1(x: Int, y: Int) = x+y


fun printName(name: String): Unit { // Unit means this function does not return anything (void)
    println("Name is: $name")
}

fun printPersonalDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()): Unit { // Unit means this function does not return anything (void)
    println("Name is: $name and email is: $email and the dob is $dob")
}



fun main() {
    val x = printName("Kei")
    println(x)
    val result = addition(1, 2)
    println("Result is: $result")

    val result1 = additionApproach1(1, 2)
    println("Result is: $result1")

    // Default parameters
    printPersonalDetails("Kei")
    // Named parameters
    printPersonalDetails(email = "kei.nufer@gmail.com", dob = LocalDate.parse("1981-01-16"), name = "Kei")
}