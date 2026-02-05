package org.example.tutorials.injection.constr.item1;

import java.util.List;

public interface PersonService {
    void save(PersonDTO dto);

    void update(PersonDTO dto, int id);

    void delete(int id);

    List<PersonDTO> findAll();
}
