package Part_2.E_University.controllers;

import Part_2.E_University.models.Teacher;
import Part_2.E_University.services.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final UserService<Teacher> teacherService;

    public TeacherController(UserService<Teacher> teacherService) {
        this.teacherService = teacherService;
    }

    //@PostMethod("/teachers")
    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        teacherService.create(fullName, age, phoneNumber, groupTitle);
    }

    //@GetMethod("/teachers")
    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    //@DeleteMethod("/teachers")
    @Override
    public int remove(String fullName) {
        return teacherService.remove(fullName);
    }

    @Override
    public List<Teacher> getAllSortByFullName() {
        return teacherService.getAllSortByFullName();
    }

    @Override
    public List<Teacher> getAllSortById() {
        return teacherService.getAllSortById();

    }
}
