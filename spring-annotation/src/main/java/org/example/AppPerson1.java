package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.tutorials.config.ProjectConfig;
import org.example.tutorials.dtos.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppPerson1 {
    private static final Log log = LogFactory.getLog(AppPerson1.class);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Person p = context.getBean(Person.class);
//        log.info(p);
//        p.setAge(20);
//        p.setName("Timur");
//        log.info(p);
        Person p1 = context.getBean("myName", Person.class);
        log.info(p1);
//        Person p1 = context.getBean("person1", Person.class);
//        Person p2 = context.getBean("person2", Person.class);
//        log.info(p1);
//        log.info(p2);
    }
}
