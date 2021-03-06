package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class testStudent{
    @Test
    public void testImplementation() {
        // given
        student student = new student(null, null);

        // when
        Boolean result = student instanceof Learner;

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void testInheritance() {
        // given
        student student = new student(null, null);

        // when
        Boolean result = student instanceof Person;

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void testLearn() {
        // given
        student student = new student(null, null);
        Double numberOfHoursToLearn = 98.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToLearn;

        // when
        student.learn(numberOfHoursToLearn);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }


}