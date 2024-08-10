package org.example.com.kotlinplayground.classes

class Item() { // No parameters for primray constructor
    var name: String = ""

    var price: Double = 0.0
        get() {
            println("Inside getter field price")
            return field
        }
        set(value) {
            if (value > 0.0) {
                println("Inside setter field price")
                field = value
            }
            else {
                throw IllegalArgumentException("Value must be greater than 0")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }

}

fun main() {
    val item  = Item(_name = "Iphone")
    println("Item name: ${item.name}")
    item.name = "Iphone 13"
    println("Item name: ${item.name}")
    println(item)

    println(item.price)
    item.price = -10.0
    println(item.price)
}