package com.alexaled.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TasksSorter {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", 2));
        tasks.add(new Task(2, "Task 2", 3));
        tasks.add(new Task(3, "ATask 3", 1));

        for (Task t: tasks) {
            System.out.println(t);
        }

        Collections.sort(tasks);

        for (Task t: tasks) {
            System.out.println(t);
        }
    }
}
