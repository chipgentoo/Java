package HomeWork.Part_2.E_University.view;

public interface UserView {
    void sendOnConsole(); //GET
    void sendOnConsole(SortType sortType); //GET
    void sendOnConsole(String fullname); //GET
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);//POST
    void removeUser(String fullName); //DELETE

}
