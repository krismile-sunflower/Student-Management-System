package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(allowCredentials = "true")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/getAll")
    public List<Student> queryAllUser(){
        return studentService.queryAllStudent();
    }

    @PostMapping("/add")
    public int addStudent(@RequestBody(required=false) Student student){
        int fag = studentService.addStudent(student);
        if(fag != 0)
            return 200;
        else
            return 400;
    }

    @PostMapping("/update")
    public int updateStudent(@RequestBody Student student){
        int fag = studentService.updateStudent(student);
        if(fag != 0)
            return 200;
        else
            return 400;
    }

    @DeleteMapping("/delete/{id}")
    public int deleteStudent(@PathVariable("id") String id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/find/{id}")
    public Student findStudentById(@PathVariable("id") String id){
        return studentService.findStudentById(id);
    }

}
