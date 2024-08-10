package org.example.com.kotlinplayground.classes

// Use primary constructor whenever possible, use default values if secondary constructors are required
class Person(
    val name: String = "",
    val age: Int = 0
) {

    var email: String = ""
    var namelength: Int = 0

    init {
        println("Inside init block")
        namelength = name.length
    }

    constructor(_email: String, _name: String = "", _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {

    val person = Person("Kei", 43)
    person.action()
    println("Name, ${person.name} and age ${person.age}")

    val person1= Person()
    person.action()
    println("Name, ${person1.name} and age ${person1.age}")

    // Use secondary constructor
    val person2 = Person(_email = "kei.nufer@gmail.com", _age = 25, _name = "Alex")
    println("Name is, ${person2.name} and age ${person2.age} and email is ${person2.email} and namelength is ${person2.namelength}")
}