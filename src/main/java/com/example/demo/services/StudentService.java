package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private  StudentRepository studentRepository;


    

    public Student save(Student student) {
        return studentRepository.save(student);
    }

}
