package org.example.tutorials.injection.constr.item2;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    List<PersonDTO> personList = new ArrayList<>();
    @Override
    public void save(PersonDTO dto) {
            personList.add(dto);
    }

    @Override
    public List<PersonDTO> findAll() {
        return personList;
    }
}
