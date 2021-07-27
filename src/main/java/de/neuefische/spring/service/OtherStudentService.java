package de.neuefische.spring.service;

import de.neuefische.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("other")
public abstract class OtherStudentService implements StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student("Klaudia", "987"),
                new Student("Mario", "876")
        );
    }
}
