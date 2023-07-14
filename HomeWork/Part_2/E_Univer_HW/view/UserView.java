package HomeWork.Part_2.E_Univer_HW.view;

import HomeWork.Part_2.E_Univer_HW.model.User;

public interface UserView <T extends User> {
    void sendOnConsole();
    Long create(T user);
    Boolean remove(String fullName);
}
