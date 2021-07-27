package de.neuefische.spring.service;

import de.neuefische.spring.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.net.http.HttpRequest;
import java.util.List;
@Service("default")
public class DefaultStudentService implements StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student("Klaus", "123"),
                new Student("Maria", "234")
        );
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
}
