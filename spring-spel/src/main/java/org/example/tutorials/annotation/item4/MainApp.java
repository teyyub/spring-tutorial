package org.example.tutorials.annotation.item4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Beans17.xml");

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

    }
}