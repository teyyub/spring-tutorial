package org.example.tutorials.annotation.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example.tutorials.annotation.components");
        context.refresh();

        HelloWorldComponent ms =(HelloWorldComponent) context.getBean("hw");
        HelloWorldComponent ms1 =(HelloWorldComponent) context.getBean("hw");
        System.out.println(ms == ms1);

        context.close();
    }
}
