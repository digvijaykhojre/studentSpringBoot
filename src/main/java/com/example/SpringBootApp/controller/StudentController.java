package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.dtos.Student;
import com.example.SpringBootApp.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("{id}")
    public Student getData(@PathVariable int id){
        Student s=studentService.getStudent();
        s.setGrade(id);
        return s;
    }
}
