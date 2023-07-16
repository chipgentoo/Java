package HomeWork.Part_2.E_University.controllers;

import HomeWork.Part_2.E_University.models.User;

import java.util.List;

public interface UserController <T extends User> {
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    int remove(String fullName);
    List<T> getAllSortByFullName();
    List<T> getAllSortById();

}
