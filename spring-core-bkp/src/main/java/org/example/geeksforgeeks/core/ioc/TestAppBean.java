package org.example.geeksforgeeks.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("geeks/Beans.xml");

        // Get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);

        // Calling the methods
        sim.calling();
        sim.data();

        Sim sim1 = applicationContext.getBean("sim1", Sim.class);

        // Calling the methods
        sim1.calling();
        sim1.data();

    }
}
