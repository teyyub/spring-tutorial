package org.example.tutorials.annotation.components;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hw")
//@Lazy
@Scope("prototype")
//@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

public class HelloWorldComponent {
    public HelloWorldComponent(){
        System.out.println("cons.....");
    }
}
