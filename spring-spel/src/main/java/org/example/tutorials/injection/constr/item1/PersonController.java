package org.example.tutorials.injection.constr.item1;

import java.util.List;

public class PersonController {
    PersonService personService;
    public PersonController(PersonService service){
        this.personService = service;
    }

    public  void save(){
        PersonDTO dto = new PersonDTO();
        dto.setName("Ali");
        personService.save(dto);
    }

    public List<PersonDTO> findAll(){

        return personService.findAll();
    }

    public void printList(){
        System.out.println(findAll());
    }

}
