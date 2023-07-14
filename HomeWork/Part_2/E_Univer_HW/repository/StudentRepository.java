package HomeWork.Part_2.E_Univer_HW.repository;

import HomeWork.Part_2.E_Univer_HW.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements UserRepository<Student>{
    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public Long create(Student student){
        student.setId(getMaxId()+1);
        students.add(student);
        return getMaxId();
    }

    @Override
    public Boolean remove(String fullName){
        for (Student student : students) {
            if (student.getFullName().equals(fullName)){
                students.remove(student.getId());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }


    private Long getMaxId() {
        Long maxId = 0L;
        for (Student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }

}
