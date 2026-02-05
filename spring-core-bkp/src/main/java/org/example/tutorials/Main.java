package org.example.tutorials;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        HelloWorld hw = new HelloWorld();
//        hw.setMessage("Hello World");
//        hw.getMessage();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");


        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");
        obj.getMessage();

        HelloWorld obj1 = (HelloWorld) context.getBean("h2");
        obj1.getMessage();
        obj1.setMessage("C++ learning");
        obj1.getMessage();

        System.out.println("============================");



    }
}