package org.example.tutorials.ioc;

public class Test {
    public static void main(String[] args) {
        Walkable w = new Human();
        w.walk();
        Walkable w1 = new Bird();
        w1.walk();
    }
}
