package de.neuefische.spring.service;

import de.neuefische.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("default")
public class DefaultStudentService implements StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student("Klaus", "123"),
                new Student("Maria", "234")
        );
    }
}
