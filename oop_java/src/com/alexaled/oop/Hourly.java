package com.alexaled.oop;

public class Hourly extends Employee {
    public static final double DEFAULT_HOUR_RATE = 120;
    public static final double DEFAULT_WORK_HOURS_PER_WEEK = 40;
    private double salary = DEFAULT_HOUR_RATE * DEFAULT_WORK_HOURS_PER_WEEK;

    public Hourly() {
    }

    public Hourly(String name) {
        this(name, DEFAULT_HOUR_RATE * DEFAULT_WORK_HOURS_PER_WEEK);
    }

    public Hourly(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }
}
