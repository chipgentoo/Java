package HomeWork.Part_2.E_Univer_HW.service;

import HomeWork.Part_2.E_Univer_HW.model.Student;
import HomeWork.Part_2.E_Univer_HW.repository.UserRepository;

import java.util.List;

public class StudentService implements UserService<Student>{

    private final UserRepository<Student> userRepository;

    public StudentService(UserRepository<Student> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long create(Student student) {
        return userRepository.create(student);
    }

    @Override
    public Boolean remove(String fullName) {
        return userRepository.remove(fullName);
    }

    @Override
    public List<Student> getAll() {
        return userRepository.getAll();
    }
}
