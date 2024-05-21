package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "discipline")
public class Discipline {
    @Id
    @GeneratedValue
    @Column(name = "discipline_id", nullable = false)
    private Long id;
    @Column(name = "discipline_name", nullable = false)
    private String name;
}