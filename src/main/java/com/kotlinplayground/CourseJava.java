package com.kotlinplayground;

import java.util.List;

public class CourseJava {
    private Integer id;
    private String name;
    private String author;
    private List<String> keyList_;


    public CourseJava(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.keyList_ = java.util.Collections.emptyList();
    }

    public List<String> getKeyListList() {
        return keyList_;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
