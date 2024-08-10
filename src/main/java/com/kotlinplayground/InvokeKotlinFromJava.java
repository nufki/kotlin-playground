package com.kotlinplayground;

import org.example.com.kotlinplayground.classes.Authenticate;
import org.example.com.kotlinplayground.classes.Course;
import org.example.com.kotlinplayground.classes.CourseCategory;
import org.example.com.kotlinplayground.classes.CourseKt;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {
        var course = new Course(1, "Blablabla", "Kei", CourseCategory.DEVELOPMENT);

        System.out.println("Course: " + course);

        // Java does not have a concept of default value
        CourseKt.printName();
        CourseKt.printName("abc");

        Course.Companion.printName2("abcd");
        Course.printNameAsStatic("static"); // Directly only with @JvmStatic

        course.setNoOfCourses(5); // This is possible
        course.asField = 3; // Directly only with @JvmField

        // How to invoke kotlin object class in java
        Authenticate.INSTANCE.autenticate("xxx", "yyy"); // Using INSTANCE
        Authenticate.autenticate2("xxx", "yyy"); // Using JvmStatic
    }
}
