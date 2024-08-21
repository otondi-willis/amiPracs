package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student willis = new Student(
                    "Willis",
                    "willis.otondi@gmail.com",
                    LocalDate.of(2000, 1, 5));
            Student alice = new Student(
                    "alice",
                    "alice.otondi@gmail.com",
                    LocalDate.of(2001, 2, 5));
            Student mungai = new Student(
                    "mungai",
                    "alice.otondi@gmail.com",
                    LocalDate.of(2001, 3, 5));

            repository.saveAll(
                    List.of(willis, alice,mungai)
            );
        };
    }
}
