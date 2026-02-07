package org.example.tutorials;

import org.example.tutorials.controller.PersonController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class H2App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("warehouse/dbBeans.xml");

        PersonController controller = context.getBean(PersonController.class);
        controller.getAllPersons();
        controller.handleRequest("Ali");
        controller.getAllPersons();
        controller.handleRequest("Veli");
        controller.getAllPersons();
    }
}
