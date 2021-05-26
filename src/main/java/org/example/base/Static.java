package org.example.base;

public class Static {
    {
        new Show("code block");
    }

    {
        new Show("code block other");
    }

    public static void staticMethod() {
        new Show("static method");
        staticVariable = "resume assignment value in static method";
    }

    public static void staticMethodOther() {
        new Show("static method other");
    }

    static {
        new Show("static code block");
    }

    public static String staticVariable = Show.create("static variable");

    public static String staticVariableOther = Show.create("static variable other");

    public static final String staticFinalVariable = Show.create("static final variable");

    public String nonStaticVariable = Show.create("non static variable");

    public String nonStaticVariableOther = Show.create("non static variable other");

    static {
        new Show("static code block other");

        staticVariable = "resume assignment value in static block";
    }

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
