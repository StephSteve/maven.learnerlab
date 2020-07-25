package com.github.curriculeon;

import org.junit.Test;
import org.junit.Assert;

public class TestInstructor {
    @Test
    public void testImplementation() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Teacher;

        // then
        Assert.assertTrue(outcome);
    }

    public void testInheritance() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach() {
        // given
        Instructor instructor = new Instructor(null, null);
        Learner learner = new student(null, null);
        Double numberOfHoursToTeach = 134.0;
        Double preStudyTime = learner.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToTeach;

        // when
        instructor.teach(numberOfHoursToTeach, learner);
        Double actual = learner.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLecture() {
        // given
        Teacher teacher = new Instructor(null, null);
        Learner[] learners = new Learner[]{
                new student(0L, "Leon"),
                new student(1L, "Christopher"),
                new student(2L, "Hunter"),
        };
        Double numberOfHours = 128.0;
        Double expected = numberOfHours/learners.length;

        // when
        teacher.lecture(learners, numberOfHours);

        // then
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual = learner.getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }
    }
}
