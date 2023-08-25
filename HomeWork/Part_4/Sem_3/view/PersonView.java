package Part_4.Sem_3.view;

import Part_4.Sem_3.model.Person;

import java.io.IOException;
import java.text.ParseException;

public interface PersonView <T extends Person>{
    void create(T person);
    void save() throws IOException;

    boolean checkNumberParams(String strHuman);
    T validationHumanString(String[] params) throws Exception;
}
