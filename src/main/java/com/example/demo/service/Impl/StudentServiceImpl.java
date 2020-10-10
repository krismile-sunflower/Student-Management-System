package com.example.demo.service.Impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        studentDao.addStudent(student);
        return 200;
    }

    @Override
    public int deleteStudent(String id) {
        return studentDao.deleteStudent(id);

    }

    @Override
    public int updateStudent(Student student) {
        studentDao.updateStudent(student);
        return 200;
    }

    @Override
    public Student findStudentById(String id) {
       return studentDao.findStudentById(id);

    }

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }
}
