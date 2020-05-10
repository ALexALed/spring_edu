package com.alexaled.demo.entities;

public class Greeting {
    private String message;

    public Greeting() {

    }

    public Greeting(String userMessage) {
        message = userMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}