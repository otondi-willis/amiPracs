package com.springbootlearning.amigos.learning_springbootAmi;

import com.springbootlearning.amigos.learning_springbootAmi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class LearningSpringbootAmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringbootAmiApplication.class, args);
	}



}
