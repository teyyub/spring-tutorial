package org.example.tutorials.controller;

import org.example.tutorials.dtos.Person;
import org.example.tutorials.service.PersonService;

import java.util.List;

// 3. Controller
public class PersonController {
    private PersonService service;

    // Setter Injection üçün
    public void setService(PersonService service) {
        this.service = service;
    }

    public void handleRequest(String name) {
        service.createPerson(name);
    }

    public void getAllPersons() {
       List<Person> personList = service.getAll();
       for (Person person : personList) {
           System.out.println(person);
       }
    }
}
