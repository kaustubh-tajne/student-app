package com.example.student_app.service;

import com.example.student_app.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void createStudent(Student student);
}
