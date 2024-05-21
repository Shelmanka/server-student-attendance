package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id", nullable = false)
    private Long id;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "status", nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}