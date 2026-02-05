package org.example.tutorials.injection.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans6.xml");


        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

//        SpellChecker spellChecker = (SpellChecker) context.getBean("spellChecker");
//        spellChecker.checkSpelling();

//        TextEditor t = new TextEditor(new SpellChecker());

    }
}
