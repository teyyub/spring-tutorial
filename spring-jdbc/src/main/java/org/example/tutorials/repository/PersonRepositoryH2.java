package org.example.tutorials.repository;

import org.example.tutorials.dtos.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class PersonRepositoryH2 {
    private JdbcTemplate jdbcTemplate;

    // XML-dən enjekte olunacaq
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public void save(Person p) {

        String sql = "INSERT INTO person (id, name) VALUES (?, ?)";
        int id = new Random().nextInt(10000);
        jdbcTemplate.update(sql,id, p.getName());
    }



    public List<Person> findAll() {
        String sql = "SELECT * FROM person ";
//        System.out.printf("SQL: %s\n", sql);
        List<Person> personList = jdbcTemplate.query(sql, (rs, rowNum) -> {
                    Person person = new Person();
                    person.setId(rs.getInt("id"));     // Bazadakı "id" sütununu oxu
                    person.setName(rs.getString("name")); // Bazadakı "name" sütununu oxu
                    return person;
                }
        );
        return personList;
    }
}
