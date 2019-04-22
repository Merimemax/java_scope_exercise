package com.cognizant.scope;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student s1;
    Student s2;

    @Before
    public void setup() {
        s1 = new Student();

        s1.setId(1);
        s1.setFirstname("Someone");
        s1.setLastname("Son Of Someone");
        s1.setAge(10);


        s2 = new Student();
        s2.setId(1);
        s2.setFirstname("SOMEONE");
        s2.setLastname("Son of Someone");
        s2.setAge(10);
    }

    @Test
    public void compareTwoObject() {

        assert(s1.equals(s2));
    }
}
