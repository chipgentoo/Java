package Part_2.E_University.services;

import Part_2.E_University.models.Student;
import Part_2.E_University.models.User;
import Part_2.E_University.repositories.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> studentRepository;

    public StudentService(UserRepository<Student> userRepository) {
        this.studentRepository = userRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {

        studentRepository.create(new Student(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Student> getAll() {
        var students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }

    public List<Student> getAllSortByFullName() {
        var students = studentRepository.getAll();
        students.sort(Comparator.comparing(User::getFullName));
        return students;
    }

    public List<Student> getAllSortById() {
        var students = studentRepository.getAll();
        students.sort(Comparator.comparing(User::getId));
        return students;
    }

    @Override
    public int remove(String fullName) {
        return studentRepository.remove(fullName);
    }

    @Override
    public List<Student> getAllByTitile(String groupTitle) {
        return studentRepository.getAllByGroupTitle(groupTitle);
    }
}
