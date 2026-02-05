package org.example.tutorials;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");
        obj.setMessage("C++");
        obj.getMessage();


        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld1");
        obj1.getMessage();




    }
}
