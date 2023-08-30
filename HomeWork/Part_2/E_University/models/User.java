package Part_2.E_University.models;

import lombok.Data;

public abstract class User implements Comparable<User> {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupTitle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

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
