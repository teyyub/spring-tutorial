package org.example.tutorials.annotation.item3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TextEditorConfig {
    @Bean
    public  TextEditor textEditor(){
        return new TextEditor();
    }
    @Bean
    public  SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
