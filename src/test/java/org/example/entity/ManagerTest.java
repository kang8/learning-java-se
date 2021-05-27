package org.example.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void testNonStaticVariable() {
        Manager manager = new Manager();

        assertEquals("no set name", manager.name);
    }

    @Test
    void testStaticVariable() {
        assertEquals("no set id", Manager.id);
    }
}