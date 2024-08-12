package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping //to annotate as RESTful
    public List<Student> getStudents(){
        return List.of(
                new Student(2L,
                        "Willis",
                        "willis.otondi@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21)
        );
    }
}
