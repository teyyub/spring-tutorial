package org.example.tutorials.injection;

public class Test {
    public static void main(String[] args) {
//        TextEditor  te = new TextEditor(new SpellChecker());
        SpellChecker spellChecker = new SpellChecker();
        TextEditor  te = new TextEditor(spellChecker);
    }
}
