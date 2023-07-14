package HomeWork.Part_2.E_Univer_HW.view;

import HomeWork.Part_2.E_Univer_HW.controller.UserController;
import HomeWork.Part_2.E_Univer_HW.model.Student;

public class StudentView implements UserView<Student>{
    private final UserController<Student> studentController;

    public StudentView(UserController<Student> studentController) {
        this.studentController = studentController;
    }

    @Override
    public void sendOnConsole() {
        System.out.println("Отправили что-то на консоль");
    }

    @Override
    public Long create(Student student) {
        return studentController.create(student);
    }

    @Override
    public Boolean remove(String fullName) {
        return studentController.remove(fullName);
    }
}
