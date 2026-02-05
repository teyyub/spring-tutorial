package org.example.tutorials.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");
        Walkable obj =  context.getBean("walk", Walkable.class);
        obj.walk();
//
//        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld2");
//        obj1.getMessage();
//        obj1.setMessage("C++ learning");
//        obj1.getMessage();
    }
}
