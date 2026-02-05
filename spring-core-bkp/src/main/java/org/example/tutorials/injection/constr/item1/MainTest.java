package org.example.tutorials.injection.constr.item1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

//        DIContainer



        ApplicationContext context = new ClassPathXmlApplicationContext("Beans9.xml");

        PersonController pc = (PersonController) context.getBean("personController");
        pc.save();
        pc.printList();
    }
}
