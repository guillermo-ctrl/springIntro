package de.neuefische.spring.controller;

import de.neuefische.spring.model.Student;
import de.neuefische.spring.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Resource(name = "other")
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudentList() {
        return this.studentService.getStudents();
    }

}
