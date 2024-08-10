package org.example.com.kotlinplayground.collections

/*
difference between set and list collections:
The primary difference between list and set is that a list allows duplicate
elements and maintains their order, while a set ensures element uniqueness
without any guaranteed order. Since lists are ordered, position indexing is
allowed in them. However, in unordered items like sets, positional indexing is not possible.

When to use set and when to use list?
1) If you want to access the elements in the same way you're inserting them, then you should use List
   because List is an ordered collection of elements. ...
2) If your elements contains duplicates, then use List because Set doesn't allow duplicates whereas
   if your elements are unique, then you can use Set.

What's more performant set or list?
Sets are more efficient than lists for storing nonduplicate elements. Lists are useful for accessing elements
through the index. The elements in a list can be accessed through the index.
 */
fun main () {

    // List Collections
    var namesList = listOf("Alex", "Ben", "Chloe")  // Create immmutable collections
    println("Names $namesList")

    // List Collections (Mutable)
    var namesMutableList = mutableListOf("Alex", "Ben", "Chloe")  // Create immmutable collections
    namesMutableList.add("Kei")
    println("Names mutable $namesMutableList")

    // Set Collections
    var set = setOf("Alex", "Ben", "Chloe")
    println("set $set")

    // Set Collections (Mutable)
    var setMutable = mutableSetOf("Alex", "Ben", "Chloe")
    setMutable.add("Kei")
    println("set mutable $setMutable")

    // Map Collections
    var nameAgeMap = mapOf("Kei" to 34, "Scopby" to 4)
    println("age map $nameAgeMap")

    // Map Collections (Mutable)
    var nameAgeMapMutable = mutableMapOf("Kei" to 43, "Scopby" to 4)
    nameAgeMapMutable["Dilip"] = 34
    println("age map mutable $nameAgeMapMutable")

}