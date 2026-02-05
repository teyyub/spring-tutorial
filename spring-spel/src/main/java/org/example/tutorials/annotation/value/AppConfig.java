package org.example.tutorials.annotation.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.tutorials.annotation.value") // Change package name accordingly
public class AppConfig {

}