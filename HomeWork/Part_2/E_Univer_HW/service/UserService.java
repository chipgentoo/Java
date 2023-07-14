package HomeWork.Part_2.E_Univer_HW.service;

import HomeWork.Part_2.E_Univer_HW.model.User;

import java.util.List;

public interface UserService <T extends User> {
    Long create(T user);
    Boolean remove(String fullName);
    List<T> getAll();
}
