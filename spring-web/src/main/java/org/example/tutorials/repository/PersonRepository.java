package org.example.tutorials.repository;

import org.example.tutorials.dtos.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
