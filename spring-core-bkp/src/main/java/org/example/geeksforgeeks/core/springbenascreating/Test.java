package org.example.geeksforgeeks.core.springbenascreating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/geeks/student.xml");
        Student student = context.getBean("st",Student.class);
        student.displayInfo();


    }
}
