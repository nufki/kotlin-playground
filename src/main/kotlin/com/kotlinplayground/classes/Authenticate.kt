package org.example.com.kotlinplayground.classes

object Authenticate {

    fun autenticate(username: String, password: String) {

        println("User autentiate for user $username and $password")
    }
}

fun main () {
    Authenticate.autenticate("Kei", "xasdfl")
}