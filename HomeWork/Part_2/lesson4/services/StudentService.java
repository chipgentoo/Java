package HomeWork.Part_2.lesson4.services;

import HomeWork.Part_2.lesson4.models.Student;
import HomeWork.Part_2.lesson4.models.User;
import HomeWork.Part_2.lesson4.repositories.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> userRepository;

    public StudentService(UserRepository<Student> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {

        userRepository.create(new Student(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Student> getAll() {
        var students = userRepository.getAll();
        Collections.sort(students);
        return students;
    }

    public List<Student> getAllSortByFullName() {
        var students = userRepository.getAll();
/*        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });*/
//        students.sort((o1, o2) -> o1.getFullName().compareTo(o2.getFullName()));
        students.sort(Comparator.comparing(User::getFullName));

        return students;
    }

    public List<Student> getAllSortById() {
        var students = userRepository.getAll();
        students.sort(Comparator.comparing(User::getId));
        return students;
    }



    @Override
    public int remove(String fullName) {
        return userRepository.remove(fullName);
    }

    @Override
    public List<Student> getAllByTitile(String groupTitle) {
        return userRepository.getAllByGroupTitle(groupTitle);
    }
}
