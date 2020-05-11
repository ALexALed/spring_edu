package com.alexaled.interfaces;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
    private int id;
    private String name;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now();
    private int priority;
    private boolean complited;

    public Task() {
    }

    public Task(int id, String name, LocalDate startDate, LocalDate endDate, int priority, boolean complited) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.complited = complited;
    }

    public Task(int id, String name, int priority) {
        this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplited() {
        return complited;
    }

    public void setComplited(boolean complited) {
        this.complited = complited;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priority=" + priority +
                ", complited=" + complited +
                '}';
    }

    @Override
    public int compareTo(Task task) {
        return name.compareTo(task.getName());
    }
}
