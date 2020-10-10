package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello1")
    public String hello1(){
        return "hello world";
    }




}
