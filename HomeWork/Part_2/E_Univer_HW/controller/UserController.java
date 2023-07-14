package HomeWork.Part_2.E_Univer_HW.controller;

import HomeWork.Part_2.E_Univer_HW.model.User;

import java.util.List;

public interface UserController <T extends User> {
    Long create(T user);
    Boolean remove(String fullName);
    List<T> getAll();
}
