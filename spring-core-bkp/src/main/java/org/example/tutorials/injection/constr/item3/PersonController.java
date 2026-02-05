package org.example.tutorials.injection.constr.item3;

import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class PersonController {
    PersonService personService;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    //    public PersonController(PersonService service){
//        this.personService = service;
//    }

    public  void save(){
        PersonDTO dto = new PersonDTO();
        dto.setName("Ali");
        personService.save(dto);
    }

    public List<PersonDTO> findAll(){
        return personService.findAll();
    }

    public void printList(){
         for(PersonDTO dto:findAll()){
             System.out.println(dto);
         }
    }

}
