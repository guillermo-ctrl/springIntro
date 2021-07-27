package de.neuefische.spring.controller;

import de.neuefische.spring.model.Student;
import de.neuefische.spring.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Resource(name = "default")
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudentList() {
        return this.studentService.getStudents();
    }

    @GetMapping("/{name}")
    public Student getStudent(@PathVariable String name) {
        return studentService.getStudent(name);
    }

    @PutMapping
    public void putStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        System.out.println("hat funktioniert");
    }


}
