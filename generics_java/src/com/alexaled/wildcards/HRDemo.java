package com.alexaled.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HRDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Homer"),
                new Employee("Maggie"),
                new Employee("Lisa")
        );

        List<Salaried> salariedEmps = Arrays.asList(
          new Salaried("Kyle"),
          new Salaried("Bart")
        );

        System.out.println(employees);
        System.out.println("------------------------");
        System.out.println(salariedEmps);

        HR.printEmpNames(employees);
        System.out.println("------------------------");
        HR.printEmpAndSubclassNames(salariedEmps);
    }
}
