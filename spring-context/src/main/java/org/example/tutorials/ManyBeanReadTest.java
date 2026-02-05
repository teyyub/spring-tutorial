package org.example.tutorials;

import org.example.tutorials.dtos.HelloWorld;
import org.example.tutorials.dtos.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManyBeanReadTest {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext( new String[] {"Beans.xml", "Beans1.xml"});


        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");
        obj.getMessage();

        Person p = (Person) context.getBean("person1");
        System.out.println(p);
     }
}
