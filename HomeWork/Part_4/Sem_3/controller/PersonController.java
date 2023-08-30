package Part_4.Sem_3.controller;

import Part_4.Sem_3.model.Person;

import java.io.IOException;

public interface PersonController <T extends Person>{
    void create(T person);
    void save() throws IOException;
}
