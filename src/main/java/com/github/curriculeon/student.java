package com.github.curriculeon;

public class student  extends Person implements Learner {
    private double totalStudyTime;
    public student(Long id, String name) {
        super(id, name);
    }

    student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime =  totalStudyTime + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}

