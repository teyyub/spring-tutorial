package org.example;

import org.example.tutorials.controller.PersonController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPerson {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("warehouse/personBeans.xml");

        // Biz ancaq Controller-i çağırırıq
        PersonController controller = context.getBean(PersonController.class);

        // Controller istifadə edildikdə, o Service-i, Service isə Repo-nu işlədəcək
        controller.handleRequest("Ali");
        controller.handleRequest("Veli");
        controller.getAllPersons();
    }
}
