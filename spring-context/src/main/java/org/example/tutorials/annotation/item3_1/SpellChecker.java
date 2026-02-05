package org.example.tutorials.annotation.item3_1;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    public SpellChecker(){

        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }
}
