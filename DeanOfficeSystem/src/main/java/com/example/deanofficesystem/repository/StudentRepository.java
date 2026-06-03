package com.example.deanofficesystem.repository;

import com.example.deanofficesystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}