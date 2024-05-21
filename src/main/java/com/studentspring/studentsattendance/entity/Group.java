package com.studentspring.studentsattendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "group_id", nullable = false)
    private Long id;
    @Column(name = "group_name", nullable = false, unique = true)
    private String name;
}
