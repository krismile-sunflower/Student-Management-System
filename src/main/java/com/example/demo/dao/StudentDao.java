package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {
    int addStudent(Student student);

    int deleteStudent(String id);

    int updateStudent(Student student);

    Student findStudentById(String id);

    List<Student> queryAllStudent();
}

