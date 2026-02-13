package org.example.tutorials.repository;

import org.example.tutorials.dtos.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List<Person> database = new ArrayList<>();

    public void save(Person p) {
        database.add(p);
        System.out.println(p.getName() + " bazaya yazıldı.");
    }

    public List<Person> getAll() {
        return database;
    }
}
