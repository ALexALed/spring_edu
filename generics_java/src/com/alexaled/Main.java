package com.alexaled;

public class Main {

    public static void main(String[] args) {
        Tuple<String, String> t = new Tuple<>("Hello", "Test");
        System.out.println(t);
        System.out.println(t.getFirst());
    }
}
