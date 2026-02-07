package org.example.tutorials.service;

import org.example.tutorials.dtos.Person;
import org.example.tutorials.repository.PersonRepository;
import org.example.tutorials.repository.PersonRepositoryH2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private PersonRepositoryH2 repository;
    // Constructor Injection üçün
    public PersonService(PersonRepositoryH2 repository) {
        this.repository = repository;
    }

    public void createPerson(String name) {
        repository.save(new Person(name));
    }

    public List<Person> getAll() {
        return repository.findAll();
    }
}
