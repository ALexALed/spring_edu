package com.alexaled.oop;

public class UseHR {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.hireEmployee(new Salaried("Fred"));
        hr.hireEmployee(new Hourly("Fredy"));
        hr.hireEmployee(new Hourly("Jack"));
        hr.hireEmployee(new Salaried("John"));
        hr.printEverybody();
        hr.payEverybody();
    }
}
