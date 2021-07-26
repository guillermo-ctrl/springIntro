package de.neuefische.spring.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    /*
    @GetMapping
    public List<Student> getStudent() {

    }

     */
    @GetMapping("/hello")
    public List<Student> getStudentList() {
        return new ArrayList<Student>(List.of(new Student("Johnny")));
    }

}
