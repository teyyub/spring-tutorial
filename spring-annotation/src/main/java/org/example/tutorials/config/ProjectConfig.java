package org.example.tutorials.config;

import org.example.tutorials.dtos.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.tutorials")
@PropertySource("classpath:application.properties")
public class ProjectConfig {

//    @Scope(scopeName = "prototype")
    @Bean(name = "myName")
    @Lazy
//    @Bean
    public Person person1() {
        System.out.println(">>> Person Bean-i İNDİ yaradılır...");
        Person p = new Person("Teyyub");
        p.setAge(25);
        return p;
    }

    @Bean
    public Person person2() {
        Person p = new Person("Ali");
        p.setAge(15);
        return p;
    }


//    @Bean
//    @Primary //
//    public Person nermine() {
//        return new Person("Nermine", 25);
//    }
//
//    @Bean
//    public Person nermin() {
//        return new Person("Nermin", 22);
//    }
}
