package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.Table.Student;
public interface StudentRepository extends JpaRepository<Student, Integer>{


}