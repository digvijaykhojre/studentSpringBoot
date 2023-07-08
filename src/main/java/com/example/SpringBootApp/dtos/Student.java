package com.example.SpringBootApp.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class Student {

    private String name;
    private String age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subjects;
}
