package com.madeeasy.impl;

import com.madeeasy.Department;

public class Employee implements Department {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentInfo() {
        System.out.println("Employee: " + name);
    }
}
