package org.example.base;

import org.junit.jupiter.api.Test;

class StaticTest {

    @Test
    void runStaticMethod() {
        Static.staticMethod();
        System.out.println(Static.staticVariable);
        System.out.println("+++++++++++++++++++++");
        Static.staticMethodOther();
        Static.staticMethod();
    }

    @Test
    void runStaticVariable() {
        System.out.println(Static.staticVariable);
    }

    @Test
    void newObject() {
        new Static();
    }

    @Test
    void newObjectTwice() {
        new Static();
        System.out.println("++++++++++ Create Object Down ++++++++");
        new Static();
    }

    @Test
    void runNestedClass() {
        new Static.NestedDemo();
    }
}