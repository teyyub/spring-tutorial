package org.example.tutorials.dtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

    public Person() {}

//    @Autowired
//    public Person(@Value("${person.name}") String name,
//                  @Value("${person.age}") int age) {
//        this.name = name;
//        this.age = age;
//    }


//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
