package com.alexaled.oop;

import java.time.LocalDate;

public abstract class Employee {
    public static final String DEFAULT_NAME = "UNKNOWN";
    private static int nextId;

    private int id;
    private String name;
    private LocalDate hireDate;

    public Employee(){
        this(DEFAULT_NAME);
    }

    public Employee(String name){
        this.id = nextId++;
        this.name = name;
        this.hireDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPay();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
