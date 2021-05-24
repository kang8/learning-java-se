package org.example.base;

import org.junit.jupiter.api.Test;

class StaticTest {

    @Test
    void runStaticMethod() {
        Static.something();
        System.out.println(Static.init);
    }

    @Test
    void runStaticVariable() {
        System.out.println(Static.init);
    }

    @Test
    void newObject() {
        new Static();
        System.out.println("+++++ run other constructor  ++++++");
        new Static();
    }

    @Test
    void runNestedClass() {
        new Static.NestedDemo();
    }
}