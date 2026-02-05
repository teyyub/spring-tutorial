package org.example.tutorials.annotation.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//https://www.digitalocean.com/community/tutorials/spring-component

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example.tutorials.annotation.components");
        context.refresh();

        MathComponent ms =(MathComponent) context.getBean("mc");

        int result = ms.add(1, 2);
        System.out.println("Addition of 1 and 2 = " + result);

        context.close();
    }
}
