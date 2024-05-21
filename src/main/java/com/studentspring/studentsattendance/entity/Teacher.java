package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue
    @Column(name = "teacher_id", nullable = false)
    private Long id;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
}