package HomeWork.Part_4.Sem_3.controller;

import HomeWork.Part_4.Sem_3.model.Human;
import HomeWork.Part_4.Sem_3.service.PersonService;

import java.io.IOException;

public class HumanController implements PersonController<Human>{
    private final PersonService<Human> humanService;

    public HumanController(PersonService<Human> humanService) {
        this.humanService = humanService;
    }

    @Override
    public void create(Human human) {
        humanService.create(human);
    }

    @Override
    public void save() throws IOException {
        humanService.save();
    }
}
