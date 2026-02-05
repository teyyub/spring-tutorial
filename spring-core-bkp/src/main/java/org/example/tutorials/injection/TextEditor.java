package org.example.tutorials.injection;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private SpellChecker spellChecker;
     List<String> list = new ArrayList<>();
//    public TextEditor() {
//        spellChecker = new SpellChecker();
//    }

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    //loose coupling
    public TextEditor(List list) {
        this.list = list;
    }

}