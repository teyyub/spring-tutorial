package org.example.tutorials.jdbc;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    private StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }
    public void create(String name, Integer age){
        service.create(name,age);
    }

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id){
        return service.getStudent(id);
    }

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    public List<Student> listStudents(){
        return service.listStudents();
    }

    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public void delete(Integer id){
        service.delete(id);
    }

    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    public void update(Integer id, Integer age){
        service.update(id,age);
    }
}
