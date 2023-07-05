package com.example.SpringBootApp.service;

import com.example.SpringBootApp.dtos.Student;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class StudentService {


    public Student getStudent(){
        return new Student("ajay","28",5, Collections.emptyList());
    }
}
