package org.example.tutorials.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    @Value("Hello, Spring!")  // Injecting a simple string value
    private String message;


    @Value("${app.greeting:Salam}")
    private String property;


    public void showMessage() {
        System.out.println(message);
        System.out.printf("property = %s%n", property);
    }
}
