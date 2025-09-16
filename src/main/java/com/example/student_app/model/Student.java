package com.example.student_app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty
    @Column(name = "name")
    private String name;

    @JsonProperty
    @Column(name = "roll_no")
    private Integer rollNo;

    @JsonProperty
    @Column(name = "description")
    private String description;


}
