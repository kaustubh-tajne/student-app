package com.example.student_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private String name;

    private Integer rollNo;

    private String description;


}
