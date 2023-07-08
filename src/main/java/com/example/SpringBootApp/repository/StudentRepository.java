package com.example.SpringBootApp.repository;

import com.example.SpringBootApp.dtos.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
