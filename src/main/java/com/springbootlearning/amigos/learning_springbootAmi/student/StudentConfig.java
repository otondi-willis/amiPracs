package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            new Student(
                    "Willis",
                    "willis.otondi@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21);
        };
    }
}
