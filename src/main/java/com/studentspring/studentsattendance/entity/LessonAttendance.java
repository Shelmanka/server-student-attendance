package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lesson_attendance")
public class LessonAttendance {
    @Id
    @GeneratedValue
    @Column(name = "lesson_attendance_id", nullable = false)
    private String id;
    @OneToOne
    @JoinColumn(name = "lesson_id", unique = true)
    private Lesson lesson;

    @ManyToMany
    @JoinTable(name = "lesson_attendance_record",
            joinColumns = @JoinColumn(name = "lesson_attendance_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students = new ArrayList<>();
}