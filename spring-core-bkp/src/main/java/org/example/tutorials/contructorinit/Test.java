package org.example.tutorials.contructorinit;

import org.example.tutorials.dtos.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext  context=new ClassPathXmlApplicationContext("Beans8.xml");

//        Employee obj1 = (Employee) context.getBean("employee1");
//        obj1.show();
//
        Employee obj = (Employee) context.getBean("employee");
        obj.show();

//          Employee obj2 = (Employee) context.getBean("employee2");
//          obj2.show();


        System.out.println(context.getBeanDefinitionCount());
    }
}