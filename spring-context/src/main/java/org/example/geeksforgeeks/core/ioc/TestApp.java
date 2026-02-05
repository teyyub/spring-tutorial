package org.example.geeksforgeeks.core.ioc;

public class TestApp {
    // Main driver method
    public static void main(String[] args)
    {
         Mobile m = new Mobile();
         m.setSim(new Airtel());
         m.calling();
         m.data();

         m.setSim(new Jio());
         m.calling();
         m.data();
    }
}