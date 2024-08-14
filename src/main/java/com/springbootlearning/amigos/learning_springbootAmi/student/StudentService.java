package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //changed from Component for semantics
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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
