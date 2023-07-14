package HomeWork.Part_2.E_Univer_HW;

import HomeWork.Part_2.E_Univer_HW.controller.StudentController;
import HomeWork.Part_2.E_Univer_HW.repository.StudentRepository;
import HomeWork.Part_2.E_Univer_HW.service.StudentService;
import HomeWork.Part_2.E_Univer_HW.view.StudentView;

public class Main {
    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    public static void main(String[] args) {
        StudentView view = getStudentController();
    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }
}
