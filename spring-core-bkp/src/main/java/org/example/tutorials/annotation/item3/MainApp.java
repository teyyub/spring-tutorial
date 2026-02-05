package org.example.tutorials.annotation.item3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

//        new TextEditor(new SpellChecker()).spellCheck();
//        SpellChecker spellChecker = new SpellChecker();
//        TextEditor te = new TextEditor(new SpellChecker());
//        te.spellCheck();
    }
}