package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.tutorials.config.ProjectConfig;
import org.example.tutorials.controller.PersonController;
import org.example.tutorials.dtos.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPerson {
    private static final Log log = LogFactory.getLog(AppPerson.class);

    public static void main(String[] args) {
        System.out.println("1. Spring Konteyneri başladılır...");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("2. Spring Konteyneri artıq hazırdır!");
        Person p = context.getBean(Person.class);
//        context.containsBean(Person.class.getName());
        log.info(p);

        p.setAge(20);
        p.setName("Timur");
        log.info(p);
//        Person p1 = context.getBean("myName", Person.class);
//        Person p11 = context.getBean("myName", Person.class);
//        log.info(p1 == p11);
//        Person p1 = context.getBean("person1", Person.class);
//        Person p2 = context.getBean("person2", Person.class);
//        log.info(p1);
//        log.info(p2);
    }
}
