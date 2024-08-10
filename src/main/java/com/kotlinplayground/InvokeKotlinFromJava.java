package com.kotlinplayground;

import org.example.com.kotlinplayground.classes.Course;
import org.example.com.kotlinplayground.classes.CourseCategory;
import org.example.com.kotlinplayground.classes.CourseKt;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {
        var course = new Course(1, "Blablabla", "Kei", CourseCategory.DEVELOPMENT);

        System.out.println("Course: " + course);

        CourseKt.printName();
        CourseKt.printName("abc");
    }
}
