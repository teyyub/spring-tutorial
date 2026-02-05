package org.example.tutorials.injection.constr.item2;

import java.util.List;

public interface PersonService {
    void save(PersonDTO dto);

    List<PersonDTO> findAll();
}
