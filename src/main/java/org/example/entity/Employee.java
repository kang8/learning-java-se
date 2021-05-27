package org.example.entity;

import org.example.base.Show;

public class Employee {
    protected static String id = Show.create("no set id");

    protected String name = Show.create("no set name");
    protected double salary;

    public Employee() {
        System.out.println("init employee");
    }
}
