package org.example.tutorials.javaconfig;

import org.example.tutorials.dtos.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {

    @Bean
//    @Lazy
//    @Scope("singleton")
//    @Scope("prototype")
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

}