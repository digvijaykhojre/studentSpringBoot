package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.dtos.Student;
import com.example.SpringBootApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getData(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }


    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }


    @DeleteMapping("/deleteStudent/{id}")
    public List<Student> deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
