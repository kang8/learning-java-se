package org.example.base;

public class Static {
    {
        new Show("code block");
    }

    {
        new Show("code block other");
    }

    public static void something() {
        new Show("static method");
        init = "resume assignment value in static method";
    }

    public static void somethingOther() {
        new Show("static method for other");
    }

    static {
        new Show("static code block");
    }

    public static String init = Show.create("static variable");

    public static String initOther = Show.create("static variable for other");

    public static final String initFinal = Show.create("static final variable");

    static {
        new Show("static code block for other");

        init = "resume assignment value in static block";
    }

    public static int defaultInt;

    public Static() {
        System.out.println("constructor method");
    }

    static class NestedDemo {
        public void myMethod() {
            System.out.println("This is my nested class");
        }

        public static String init = Show.create("nest static variable");
    }
}
