package org.example.tutorials.dtos;


public class Warehouse {
    private String location;

    public void setLocation(String location) {
        this.location = location; }

    @Override
    public String toString() { return "Anbarın yeri: " + location; }
}


