package org.example.tutorials.controller;

import org.example.tutorials.dtos.Person;
import org.example.tutorials.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// 3. Controller
@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService service;

    // Setter Injection üçün
    public void setService(PersonService service) {
        this.service = service;
    }

    public void handleRequest(String name) {
        service.createPerson(name);
    }


    @GetMapping
    @ResponseBody
    public List<Person> getAllPersons() {
       List<Person> personList = service.getAll();
       personList.add(new Person("John"));
       return  personList;
    }

    @GetMapping("/v1")
    public String getAllPersonsV1(Model model) {
        List<Person> personList = service.getAll();
        Person p = new Person("John");
        p.setAge(20);
        personList.add(p);
        model.addAttribute("persons", personList);
        return "persons"; // JSP faylı: /WEB-INF/views/persons.jsp
    }
}
