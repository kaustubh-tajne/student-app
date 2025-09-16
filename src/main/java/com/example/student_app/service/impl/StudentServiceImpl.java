package com.example.student_app.service.impl;

import com.example.student_app.model.Student;
import com.example.student_app.repository.StudentRepository;
import com.example.student_app.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void createStudent(Student student) {
        Student save = studentRepository.save(student);
        log.info("Student Created Successfully - {}", save);
    }
}
