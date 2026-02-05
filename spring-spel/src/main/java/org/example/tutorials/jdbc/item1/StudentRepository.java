package org.example.tutorials.jdbc.item1;

import org.example.tutorials.jdbc.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("srepo")
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    // Constructor injection for JdbcTemplate
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Example method to fetch student details by ID
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            return student;
        });
    }

    // Example method to save a student
    public int saveStudent(Student student) {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        return jdbcTemplate.update(sql, student.getName(), student.getAge());
    }
}

