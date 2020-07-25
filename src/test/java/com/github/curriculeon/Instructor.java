package com.github.curriculeon;

public abstract class Instructor extends Person implements Teacher{
    Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void learn(Double numberOfHours) {

    }

    @Override
    public Double getTotalStudyTime() {
        return null;
    }

    @Override
    public void teach(Double numberOfHours, Learner learner) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
