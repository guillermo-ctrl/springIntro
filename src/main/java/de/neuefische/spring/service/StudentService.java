package de.neuefische.spring.service;

import de.neuefische.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getStudents();

    Student getStudent(String name);

}


