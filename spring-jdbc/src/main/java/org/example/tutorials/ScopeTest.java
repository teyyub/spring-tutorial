package org.example.tutorials;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.example.tutorials.dtos.Part;
import org.example.tutorials.dtos.Warehouse;

public class ScopeTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("warehouse/beans.xml"));

        System.out.println("--- Singleton Test (Warehouse) ---");
        Warehouse w1 = factory.getBean("bakuWarehouse", Warehouse.class);
        Warehouse w2 = factory.getBean("bakuWarehouse", Warehouse.class);
        System.out.println("W1 Hash: " + w1.hashCode());
        System.out.println("W2 Hash: " + w2.hashCode());
        System.out.println("Eyni obyektdirmi? " + (w1 == w2)); // TRUE

        System.out.println("\n--- Prototype Test (Part) ---");
        Part p1 = factory.getBean("enginePart", Part.class);
        Part p2 = factory.getBean("enginePart", Part.class);
//
////        // p1-in adını dəyişək
        p1.setName("Yenilənmiş V8 Biturbo");
//
        System.out.println("P1 Ad: " + p1.getName() + " | Hash: " + p1.hashCode());
        System.out.println("P2 Ad: " + p2.getName() + " | Hash: " + p2.hashCode());
        System.out.println("Eyni obyektdirmi? " + (p1 == p2)); // FALSE
    }
}