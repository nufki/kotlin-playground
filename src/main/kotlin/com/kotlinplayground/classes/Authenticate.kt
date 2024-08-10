package org.example.com.kotlinplayground.classes

/*
Object expressions create objects of anonymous classes, that is, classes that
aren't explicitly declared with the class declaration. Such classes are useful
for one-time use. You can define them from scratch, inherit from existing classes,
or implement interfaces. Instances of anonymous classes are also called anonymous
objects because they are defined by an expression, not a name.
 */
object Authenticate {

    fun autenticate(username: String, password: String) {
        println("User authenticate for user $username and $password")
    }

    @JvmStatic
    fun autenticate2(username: String, password: String) {
        println("User authenticate for user $username and $password")
    }
}

fun main () {
    Authenticate.autenticate("Kei", "xasdfl")
}