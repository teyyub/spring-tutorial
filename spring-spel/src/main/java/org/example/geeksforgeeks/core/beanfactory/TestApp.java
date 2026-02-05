package org.example.geeksforgeeks.core.beanfactory;

import org.example.geeksforgeeks.core.dtos.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestApp {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("geeks/bean-factory.xml");
        Student student = (Student) factory.getBean("student");

        System.out.println(student);


//        ClassPathResource resource = new ClassPathResource("geeks/bean-factory.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(resource);
    }
}
