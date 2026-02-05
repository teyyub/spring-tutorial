package org.example.tutorials.injection.constr.item2;

import java.util.List;

public class PersonController {
    PersonService personService;

    //setter based
    public void setPersonService(PersonService personService) {

        this.personService = personService;
    }

    //    public PersonController(PersonService service){
//        this.personService = service;
//    }

    public  void save(PersonDTO dto){
        personService.save(dto);
    }

    public List<PersonDTO> findAll(){
        return personService.findAll();
    }

    public void printList(){
        System.out.println(findAll());
    }

}
