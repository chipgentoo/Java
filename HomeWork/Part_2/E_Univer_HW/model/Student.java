package HomeWork.Part_2.E_Univer_HW.model;

public class Student extends User{
    public Student(String fullName, Integer age, String phone, String group) {
        super(fullName, age, phone, group);
    }

    @Override
    public String toString() {
        return String.format("Студент : id: %s, name %s, age %s, phone %s, group %s",
                getId(), getFullName(), getAge(), getPhoneNumber(), getGroupTitle());
    }
}
