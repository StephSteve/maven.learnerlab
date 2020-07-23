package com.github.curriculeon;

public abstract class Person {
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

    public abstract void learn(Double numberOfHours);

    public abstract Double getTotalStudyTime();
}
