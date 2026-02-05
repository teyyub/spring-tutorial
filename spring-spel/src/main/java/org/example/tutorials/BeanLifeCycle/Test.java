package org.example.tutorials.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
//        context.registerShutdownHook();
        System.out.println("111111");
        System.out.println("after shutdown "+context.getBean("helloWorld"));
        System.out.println(context.getBeanDefinitionCount());
        System.out.println(context.getId());
    }
}
