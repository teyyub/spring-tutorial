package org.example.tutorials.service;

import org.example.tutorials.dtos.Person;
import org.example.tutorials.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private PersonRepository repository;

    // Constructor Injection üçün
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }



    public void createPerson(String name) {
        repository.save(new Person(name));
    }

    public List<Person> getAll() {
        return repository.getAll();
    }
}
