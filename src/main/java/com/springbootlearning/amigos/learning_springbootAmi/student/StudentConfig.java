package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            new Student(2L,
                    "Willis",
                    "willis.otondi@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21)
        };
    }
}
