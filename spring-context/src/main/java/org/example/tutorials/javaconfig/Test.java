package org.example.tutorials.javaconfig;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");
//        obj.getMessage();

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld =  ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!!!");
        helloWorld.getMessage();

        HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
        helloWorld1.setMessage("Hello World 1!!!");
        helloWorld1.getMessage();

    }
}
