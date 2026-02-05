package org.example.tutorials.javaconfig;

public class Person {
    private String name;
    private static Person instance;

    private Person(){

    }

    // static block initialization for exception handling
    static {
        try {
            instance = new Person();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Person getInstance() {
        return instance;
    }
}