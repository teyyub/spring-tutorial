package org.example.tutorials.annotation.item3_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TextEditorConfig {
//    @Autowired
//    TextEditor textEditor;
    @Bean
    public TextEditor textEditor(){
        return new TextEditor();
    }
//    @Bean
//    public SpellChecker spellChecker(){
//        return new SpellChecker( );
//    }
}
