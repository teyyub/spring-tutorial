package org.example.tutorials.annotation.item2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
//                new AnnotationConfigApplicationContext("Beans15.xml");
                new ClassPathXmlApplicationContext("Beans15.xml");

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

    }
}