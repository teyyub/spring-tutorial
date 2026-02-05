package org.example.tutorials.injection.constr.item2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans10.xml");
        PersonController pc = (PersonController) context.getBean("personController");
        PersonDTO dto = new PersonDTO();
        dto.setName("Ali");
        pc.save(dto);
        PersonDTO dto1 = new PersonDTO();
        dto1.setName("ISA");
        pc.save(dto1);
        pc.printList();
    }
}
