package org.example.tutorials.dtos;

public class Part {
    private String name;
    private Warehouse warehouse; // Bu asılılıqdır (dependency)

//    public Part(Warehouse warehouse, String name) {
//
//    }
    // Spring bu metodu çağıraraq obyekti ora yerləşdirəcək
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setName(String name) { this.name = name; }

    public void info() {
        System.out.println("Hissə: " + name + ", " + warehouse);
    }

    public String getName() {
        return name;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}
