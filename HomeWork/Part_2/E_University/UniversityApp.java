package HomeWork.Part_2.E_University;

import HomeWork.Part_2.E_University.controllers.GroupController;
import HomeWork.Part_2.E_University.controllers.StudentController;
import HomeWork.Part_2.E_University.controllers.TeacherController;
import HomeWork.Part_2.E_University.repositories.StudentRepository;
import HomeWork.Part_2.E_University.repositories.TeacherRepository;
import HomeWork.Part_2.E_University.services.GroupService;
import HomeWork.Part_2.E_University.services.StudentService;
import HomeWork.Part_2.E_University.services.TeacherService;
import HomeWork.Part_2.E_University.view.GroupView;
import HomeWork.Part_2.E_University.view.StudentView;
import HomeWork.Part_2.E_University.view.TeacherView;

import java.util.Arrays;
import java.util.Scanner;

public class UniversityApp {
    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    private static TeacherRepository teacherRepository;
    private static TeacherService teacherService;
    private static TeacherController teacherController;

    public UniversityApp() {
//        -------------------------------------------------------------------------
//        studentView.create("Ivan Morozov", 18, "02", "11Б");
//        studentView.create("Ivan Morozov", 18, "02", "11Б");
//        studentView.create("Petr Vorobev", 19, "03", "10А");
//        studentView.create("Sidor Sidorov", 20, "112", "10А");
//        studentView.create("Elena Ivanova", 19, "911", "10А");
//        studentView.create("Anna Morozova", 17, "01", "11А");
//
//        groupView.printAllFromGroup("11А");
//        studentView.sendOnConsole();
//        studentView.sendOnConsole(SortType.NAME);
//        studentView.sendOnConsole(SortType.ID);
//        studentView.removeUser("Ivan Morozov");
//        studentView.sendOnConsole();
//        -------------------------------------------------------------------------

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static TeacherView getTeacherController() {
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }

    public void run(){
        StudentView studentView = getStudentController();
        TeacherView teacherView = getTeacherController();
        GroupView groupView = getGroupView();

        System.out.println("Example command:" +
                " /set-user-generate" +
                " /get-student" +
                " /get-student name" +
                " /get-student id" +
                " /get-group 11А" +
                " /create-student Ivan_Morozov 18 11A" +
                " /delete-teacher Maria_Pavlova" +
                " /set-group-student-by-id 5 11Б" +
                " /EXIT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program started");
        boolean runable = true;
        while (runable) {
            System.out.print("Input command: ");
            String command = scanner.nextLine();
            if (command.equals("/EXIT")) {
                System.out.println("Program exit");
                runable = false;
            }
            String[] commands;
            commands = command.split(" ");
            System.out.println(Arrays.toString(commands));
            switch (commands[0]) { // команда
                case "/set-user-generate" -> {
                    studentView.create("Ivan Morozov", 18, "02", "11Б");
                    studentView.create("Ivan Morozov", 18, "02", "11Б");
                    studentView.create("Petr Vorobev", 19, "03", "10А");
                    studentView.create("Sidor Sidorov", 20, "112", "10А");
                    studentView.create("Elena Ivanova", 19, "911", "10А");
                    studentView.create("Anna Morozova", 17, "01", "11А");
                }
                case "/get-student" -> {
                    if (commands.length > 1) { // если есть параметры
                        studentView.sendOnConsole(commands[1]);
                        break;
                    }
                    studentView.sendOnConsole();
                }
                case "/create-student" -> {
                    if (commands.length != 5) {
                        System.out.println("Неверное кол-во параметров");
                        break;
                    }
                    // 1-fullName; 2-age; 3-phone; 4-group
                    studentView.create(commands[1], Integer.parseInt(commands[2]), commands[3],commands[4]);
                }
                //case "" -> {
                // и дальше по накатанной.
                // Принцип построения MVC понятен.
                //}
            }
        }
    }
}