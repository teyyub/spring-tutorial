package org.example.geeksforgeeks.core.springbenascreating;

// Java Program to Illustrate College Class


import org.springframework.stereotype.Component;

// Class
@Component("collegeBean")
public class College {

    // Method
    public void test()
    {
        // Print statement
        // whenever this method is called
        System.out.println("Test College Method");
    }
}

