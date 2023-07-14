package HomeWork.Part_2.lesson4;

import HomeWork.Part_2.lesson4.controllers.GroupController;
import HomeWork.Part_2.lesson4.controllers.StudentController;
import HomeWork.Part_2.lesson4.repositories.StudentRepository;
import HomeWork.Part_2.lesson4.services.GroupService;
import HomeWork.Part_2.lesson4.services.StudentService;
import HomeWork.Part_2.lesson4.view.GroupView;
import HomeWork.Part_2.lesson4.view.SortType;
import HomeWork.Part_2.lesson4.view.StudentView;

public class Main {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    public static void main(String[] args) {
        StudentView view = getStudentController();
        GroupView groupView = getGroupView();
//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");

        groupView.printAllFromGroup("11А");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService/*, teacherService*/);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }


}
