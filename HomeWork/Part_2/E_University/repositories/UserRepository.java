package HomeWork.Part_2.E_University.repositories;

import HomeWork.Part_2.E_University.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);
}
