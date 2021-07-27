package de.neuefische.spring.service;

import de.neuefische.spring.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
@Service("default")
public class DefaultStudentService implements StudentService {

    private List <Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        students.add(new Student("Klaus", "123"));
        students.add(new Student("Maria", "234"));
        return students;
    }

    @Override
    public Student getStudent(String name) {
        List <Student> students = getStudents();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
}
