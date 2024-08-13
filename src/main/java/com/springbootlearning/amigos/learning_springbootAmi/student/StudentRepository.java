package com.springbootlearning.amigos.learning_springbootAmi.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student, Long> {

}
