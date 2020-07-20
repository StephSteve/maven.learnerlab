package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends TestCase {
    public class TestPerson {
        private void testConstructor(long expectedId, String expectedName) {
            //given
            Long ecpectedId = 0L;
            expectedName = "Some name";


            //when
            Person person = new Person(expectedId, expectedName);
            long actualId = person.getId();
            String actualName = person.getName();

            //then
            Assert.assertEquals(actualId, expectedId);
            Assert.assertEquals(actualName, expectedName);
        }

    }

}