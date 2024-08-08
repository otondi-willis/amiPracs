package com.springbootlearning.amigos.learning_springbootAmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController //makes the class to serve REST endpoints
public class LearningSpringbootAmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringbootAmiApplication.class, args);
	}

	@GetMapping //to annotate as RESTful
	public List<String> hello(){
		return List.of("Hello", "World");
	}

}
