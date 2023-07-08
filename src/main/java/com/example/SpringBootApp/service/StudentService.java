package com.example.SpringBootApp.service;

import com.example.SpringBootApp.dtos.Student;

import java.util.List;

public interface StudentService {
    Student getStudent();

    Student getStudent(int id);

    void createStudent(Student student);

    List<Student> deleteStudent(int id);

    void updateStudent(Student student);

}
