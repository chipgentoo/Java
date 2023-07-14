package HomeWork.Part_2.lesson4.services;

import HomeWork.Part_2.lesson4.models.User;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private final StudentService studentService;
//    private final TeacherService teacherService;

    public GroupService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<User> getAllUsersFromGroup(String groupTitle) {
        List<User> users = new ArrayList<>(studentService.getAllByTitile(groupTitle));
//        Collections.addAll(users, teacherService.getAll())

        return users;
    }
}
