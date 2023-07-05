package com.example.SpringBootApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private String name;
    private String age;
    private int grade;
    private List<String> subjects;
}
