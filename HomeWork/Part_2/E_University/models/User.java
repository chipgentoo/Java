package HomeWork.Part_2.E_University.models;

import lombok.Data;

@Data
public abstract class User implements Comparable<User> {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupTitle;

    public User(String fullName, Integer age, String phoneNumber, String groupTitle) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.groupTitle = groupTitle;
    }

    @Override
    public int compareTo(User o) {
        return getAge().compareTo(o.getAge());
/*        return Comparator.comparing(U)
                .thenComparing(getAge())
                .compare(this, o)*/
    }
}
