package Part_4.Sem_3.model;

import java.util.Date;

public class Human extends Person{
    public Human(String family, String name, String surname, Date birthdate, Long phone, Character sex) {
        super(family, name, surname, birthdate, phone, sex);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%d,%c",family,name,surname,birthdate.toString(),phone,sex);
    }
}
