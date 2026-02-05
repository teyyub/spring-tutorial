package org.example.tutorials;

import org.example.tutorials.dtos.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans1.xml");
        Person p1 = (Person) context1.getBean("person1");
        System.out.println(p1);
        Person p2 = (Person) context1.getBean("person2");
        System.out.println( p2);
    }
}
