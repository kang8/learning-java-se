package org.example.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void contractorManger() {
        Manager manager = new Manager();

        assertEquals("no set", manager.name);
    }
}