package org.example.tutorials.injection.constr.item3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
