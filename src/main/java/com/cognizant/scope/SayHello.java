package com.cognizant.scope;

public class SayHello {

    private static final String greeting = "Hello World";
    private static final String greetingSpecial = "Hello ";


    public static void main(String[] args) {

        System.out.println(new SayHello().greet(args[0]));
    }

    public String greet(String s) {
        if(s == null){
            return greeting;
        }

        return greetingSpecial + s;
    }
}
