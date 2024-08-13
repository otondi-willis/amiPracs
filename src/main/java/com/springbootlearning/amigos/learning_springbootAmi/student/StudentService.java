package com.springbootlearning.amigos.learning_springbootAmi.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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
