package com.cognizant.scope;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers(){
        AddTwoNumbers add = new AddTwoNumbers();
        int expected = 44;

        int actual = add.addNumbers(22, 22);

        assertEquals(expected, actual);

        //Teardown

    }
}
