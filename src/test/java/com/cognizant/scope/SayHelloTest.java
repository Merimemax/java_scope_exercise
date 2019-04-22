package com.cognizant.scope;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SayHelloTest {


    SayHello sayHello;

    @Before
    public void setUp(){
        sayHello = new SayHello();
    }

    @Test
    public void sayHello() {

        //setup
        String expected = "Hello hi";

        //excute
        String actual = sayHello.greet("hi");

        //assert
        assertEquals(expected, actual);


    }
}
