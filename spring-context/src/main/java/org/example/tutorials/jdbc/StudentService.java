package org.example.tutorials.jdbc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentJDBCTemplate repository;

    public StudentService(StudentJDBCTemplate repository){
        this.repository = repository;
    }

    public void create(String name, Integer age){
        repository.create(name,age);
    }

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id){
        return repository.getStudent(id);
    }

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    public List<Student> listStudents(){
        return repository.listStudents();
    }

    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public void delete(Integer id){
        repository.delete(id);
    }

    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    public void update(Integer id, Integer age){
        repository.update(id,age);
    }
}
