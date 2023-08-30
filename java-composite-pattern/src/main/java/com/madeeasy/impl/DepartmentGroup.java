package com.madeeasy.impl;

import com.madeeasy.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentGroup implements Department {
    private String groupName;
    private List<Department> departments = new ArrayList<>();

    public DepartmentGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void printDepartmentInfo() {
        System.out.println("Department Group: " + groupName);
        for (Department department : departments) {
            department.printDepartmentInfo();
        }
    }
}
