package com.example.gestionnairestageecm.repositories;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestionnairestageecm.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Optional<Student> findByEmail(String email);
}