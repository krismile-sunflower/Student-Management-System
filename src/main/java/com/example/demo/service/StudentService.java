package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    int deleteStudent(String id);

    int updateStudent(Student student);

    Student findStudentById(String id);

    List<Student> queryAllStudent();
}
