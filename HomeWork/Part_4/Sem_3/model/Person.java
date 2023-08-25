package Part_4.Sem_3.model;

import java.util.Date;

public abstract class Person {
    String family;
    String name;
    String surname;
    Date birthdate;
    Long phone;
    Character sex;

    public Person(String family, String name, String surname, Date birthdate, Long phone, Character sex) {
        this.family = family;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.sex = sex;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}