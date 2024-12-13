package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public void saveStudent(@ModelAttribute Student student) {
        this.studentService.save(student);
    }
    
    @GetMapping("/student")
    public String StudentPage(){
        return "create";
    }
}
