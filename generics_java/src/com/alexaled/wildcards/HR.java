package com.alexaled.wildcards;

import java.util.List;

public class HR {
    public static void printEmpNames(List<Employee> employees) {
        employees.stream().map(Employee::getName).forEach(System.out::println);
    }

    public static void printEmpAndSubclassNames(List<? extends Employee> employees) {
        employees.stream().map(Employee::getName).forEach(System.out::println);
    }
}
