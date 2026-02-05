package org.example.tutorials.annotation.item1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
        System.out.println("=======================");

        TextEditor te1 = ctx.getBean(TextEditor.class);
        te1.spellCheck();
    }
}