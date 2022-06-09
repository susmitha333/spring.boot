package com.spring.boot.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Table.Student;
import com.spring.boot.repository.StudentRepository;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    StudentRepository studentRepository;
    
    @PostMapping("/")
    public void add(@RequestBody Student user) {
    	studentRepository.save(user);
    	
        
    }
    
    @GetMapping("/")
    public List<Student> findAllMem() {
        return studentRepository.findAll();
    }
}