package HomeWork.Part_2.E_University.services;

import HomeWork.Part_2.E_University.models.Teacher;
import HomeWork.Part_2.E_University.models.User;
import HomeWork.Part_2.E_University.repositories.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(UserRepository<Teacher> teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        teacherRepository.create(new Teacher(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Teacher> getAll() {
        var teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    public List<Teacher> getAllSortByFullName() {
        var teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getFullName));
        return teachers;
    }

    public List<Teacher> getAllSortById() {
        var teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getId));
        return teachers;
    }

    @Override
    public int remove(String fullName) {
        return teacherRepository.remove(fullName);
    }

    @Override
    public List<Teacher> getAllByTitile(String groupTitle) {
        return teacherRepository.getAllByGroupTitle(groupTitle);
    }
}
