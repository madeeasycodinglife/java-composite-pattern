package com.madeeasy;

import com.madeeasy.impl.DepartmentGroup;
import com.madeeasy.impl.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice");
        Employee employee2 = new Employee("Bob");
        Employee employee3 = new Employee("Charlie");

        DepartmentGroup developmentGroup = new DepartmentGroup("Development");
        developmentGroup.addDepartment(employee1);
        developmentGroup.addDepartment(employee2);

        DepartmentGroup marketingGroup = new DepartmentGroup("Marketing");
        marketingGroup.addDepartment(employee3);

        DepartmentGroup company = new DepartmentGroup("Company");
        company.addDepartment(developmentGroup);
        company.addDepartment(marketingGroup);

        company.printDepartmentInfo();
    }
}