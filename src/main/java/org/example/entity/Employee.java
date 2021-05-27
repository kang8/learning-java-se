package org.example.entity;

import org.example.base.Show;

public class Employee {
    protected String name = Show.create("no set");
    protected double salary;

    public Employee() {
        System.out.println("init employee");
    }
}
