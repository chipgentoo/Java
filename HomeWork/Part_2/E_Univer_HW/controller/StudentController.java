package HomeWork.Part_2.E_Univer_HW.controller;

import HomeWork.Part_2.E_Univer_HW.model.Student;
import HomeWork.Part_2.E_Univer_HW.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student>{
    private final UserService<Student> userService;

    public StudentController(UserService<Student> userService) {
        this.userService = userService;
    }

    @Override
    public Long create(Student student) {
        return userService.create(student);
    }

    @Override
    public Boolean remove(String fullName) {
        return userService.remove(fullName);
    }

    @Override
    public List<Student> getAll() {
        return userService.getAll();
    }
}
