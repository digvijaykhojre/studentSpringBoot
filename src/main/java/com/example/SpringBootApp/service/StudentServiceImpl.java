package com.example.SpringBootApp.service;

import com.example.SpringBootApp.dtos.Student;
import com.example.SpringBootApp.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student> studentList = new ArrayList<>();
    @Autowired
    private StudentRepository studentRepository;


    @PostConstruct
    public void initStudents() {
        Student s1 = new Student("s1", "28", 5, "Collections.emptyList()");
        Student s2 = new Student("s2", "29", 6, "");
        Student s3 = new Student("s3", "30", 7, "Collections.emptyList()");
        Student s4 = new Student("s4", "31", 8, "Collections.emptyList()");
        studentList.addAll(Arrays.asList(s1, s2, s3, s4));
    }

    @Override
    public Student getStudent() {
        return studentList.stream().findFirst().get();
    }

    @Override
    public Student getStudent(int id) {
        return studentList.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> deleteStudent(int id) {
        studentRepository.deleteById(id);
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public void updateStudent(Student student) {
        deleteStudent(student.getId());
        studentList.add(student);
    }
}
