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
@RestController //makes the class to serve REST endpoints
public class LearningSpringbootAmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringbootAmiApplication.class, args);
	}

	@GetMapping //to annotate as RESTful
	public List<Student> hello(){
		return List.of(
				new Student(2L,
				"Willis",
				"willis.otondi@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21)
		);
	}

}
