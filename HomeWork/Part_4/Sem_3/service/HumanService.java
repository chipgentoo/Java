package HomeWork.Part_4.Sem_3.service;

import HomeWork.Part_4.Sem_3.model.Human;
import HomeWork.Part_4.Sem_3.repository.PersonRepository;

import java.io.IOException;

public class HumanService implements PersonService<Human>{
    private final PersonRepository<Human> personRepository;

    public HumanService(PersonRepository<Human> personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void create(Human human){
        personRepository.create(human);
    }

    @Override
    public void save() throws IOException {
        personRepository.save();
    }
}
