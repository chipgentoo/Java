package HomeWork.Part_2.E_Univer_HW.model;

import lombok.Data;

@Data
public abstract class User implements Comparable<User>{
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupTitle;

    public User(String fullName, Integer age, String phone, String group) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phone;
        this.groupTitle = group;
    }

    @Override
    public int compareTo(User o) {
        return getAge().compareTo(o.getAge());
    }
}
