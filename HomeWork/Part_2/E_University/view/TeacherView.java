package Part_2.E_University.view;

import Part_2.E_University.controllers.UserController;
import Part_2.E_University.models.Student;
import Part_2.E_University.models.Teacher;

import java.util.List;

public class TeacherView implements UserView{

    private final UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    public void sendOnConsole() {
        sendOnConsole(SortType.NONE);
    }

    @Override
    public void sendOnConsole(SortType sortType) {
        List<Teacher> teachers = switch (sortType) {
            case NONE -> controller.getAll();
            case NAME -> controller.getAllSortByFullName();
            case ID -> controller.getAllSortById();
        };
        if (teachers == null || teachers.size() == 0) {
            System.out.println("Отсутствуют преподаватели для вывода");
            return;
        }
        System.out.println("===================================");
        System.out.println("Для вывода использована " + sortType);
        teachers.forEach(System.out::println);
        System.out.println("===================================");
    }

    @Override
    public void sendOnConsole(String fullname) {
        List<Teacher> teachers = controller.getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getFullName() == fullname){
                System.out.println(teacher);
            }
        }
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        controller.create(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public void removeUser(String fullName) {
        int removeCount = controller.remove(fullName);

        if (removeCount == 0) {
            System.out.println("Удаление не получилось.");
        } else {
            System.out.println("Удалено преподавателей: " + removeCount);
        }

    }

}
