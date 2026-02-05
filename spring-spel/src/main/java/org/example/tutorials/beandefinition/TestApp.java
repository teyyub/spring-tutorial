package org.example.tutorials.beandefinition;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//https://riptutorial.com/spring/example/29443/example-of-lazy-init-in-spring#:~:text=lazy%2Dinit%20in%20spring%20is,the%20spring%20container%20is%20initialized.
public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans11.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("bean names "+beanName);
        }
    }
}
