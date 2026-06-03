package com.example.deanofficesystem.service;

import com.example.deanofficesystem.entity.Student;
import com.example.deanofficesystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student getById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Student create(Student student) {
        return repository.save(student);
    }

    public Student update(Integer id, Student student) {
        Student existing = getById(id);

        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setBirthDate(student.getBirthDate());
        existing.setGroupId(student.getGroupId());

        return repository.save(existing);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}