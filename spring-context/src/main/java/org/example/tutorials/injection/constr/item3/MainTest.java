package org.example.tutorials.injection.constr.item3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans10.xml");

        PersonController pc = (PersonController) context.getBean("personController");
        pc.save();
        pc.save();
        pc.printList();
    }
}
