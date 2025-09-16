package com.example.student_app.controller;

import com.example.student_app.model.Student;
import com.example.student_app.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        log.info("Request come in getAllStudents");
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        log.info("Student info - {}", student);
        studentService.createStudent(student);
        return new ResponseEntity<>("Student created Successfully", HttpStatus.CREATED);
    }
}
