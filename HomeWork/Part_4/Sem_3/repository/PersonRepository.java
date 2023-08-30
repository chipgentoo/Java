package Part_4.Sem_3.repository;

import Part_4.Sem_3.model.Person;

import java.io.IOException;

public interface PersonRepository <T extends Person>{
    void create(T person);
    void save() throws IOException;
}
