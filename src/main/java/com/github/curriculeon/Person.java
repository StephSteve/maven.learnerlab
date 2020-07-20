package com.github.curriculeon;

public class Person {
    final Long id;
    String name;

    Person(long id, String name){
        this.id = id;
        this.name = "";

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
