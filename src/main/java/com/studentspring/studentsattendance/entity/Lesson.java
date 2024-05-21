package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue
    @Column(name = "lesson_id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "number", nullable = false)
    private int number;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}