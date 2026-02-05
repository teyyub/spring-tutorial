package org.example.tutorials.injection.constr.item1;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService{

    //postgresql baza
    List<PersonDTO> personList = new ArrayList<>();



    @Override
    public void save(PersonDTO dto) {

        personList.add(dto);
    }

    @Override
    public void update(PersonDTO dto, int id) {
        for(PersonDTO p :personList){
//            if(p.getId.equals(id)){
//                p.setName(dto.getName);
//            }
        }
    }

    @Override
    public void delete(int id) {
//            for()
//            personList.remove()
    }

    @Override
    public List<PersonDTO> findAll() {
        return personList;
    }
}
