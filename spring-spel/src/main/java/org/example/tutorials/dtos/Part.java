package org.example.tutorials.dtos;


public class Part {
    private String name;
    private double price;

    private Warehouse warehouse; // Bu asılılıqdır (dependency)

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setName(String name) { this.name = name; }

    public void info() {
        System.out.println("Hissə: " + name + ", " + warehouse + ", " + price);
    }

    public String getName() {
        return name;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
