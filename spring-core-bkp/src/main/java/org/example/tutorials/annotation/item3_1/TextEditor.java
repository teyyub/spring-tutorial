package org.example.tutorials.annotation.item3_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;


//    public TextEditor(SpellChecker spellChecker){
//         this.spellChecker = spellChecker;
//    }
//    @Autowired
//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }


    public TextEditor() {
//        this.spellChecker = new SpellChecker();
        System.out.println("Inside TextEditor constructor." );
    }
    public SpellChecker getSpellChecker( ){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}