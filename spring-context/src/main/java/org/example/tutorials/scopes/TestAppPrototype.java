package org.example.tutorials.scopes;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppPrototype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans13.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("First object");
        obj.getMessage();


        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        obj1.getMessage();
    }
}
