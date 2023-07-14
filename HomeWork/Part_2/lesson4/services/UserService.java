package HomeWork.Part_2.lesson4.services;

import HomeWork.Part_2.lesson4.models.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    int remove(String fullName);

    List<T> getAllByTitile(String groupTitle);
}
