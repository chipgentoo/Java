package Part_4.Sem_3.service;

import Part_4.Sem_3.model.Person;

import java.io.IOException;

public interface PersonService <T extends Person>{
    void create(T person);
    void save() throws IOException;
}
