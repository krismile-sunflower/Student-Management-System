package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> queryAllUser(){
        return userService.queryAllUser();
    }

    @GetMapping("/login")
    public String login(String username, String password){
        User user = userService.findUserByName(username);
        if(user == null)
            return "error username";
        if(user.getPassword().equals(password))
            return "ok";
        else
            return "error password";
    }

    @PutMapping("/find/{name}")
    public String findUserByName(@PathVariable("name") String name){
        User user =  userService.findUserByName(name);
        if(user != null)
            return "ok" ;
        else
            return "error";
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        User user1 = userService.findUserByName(user.getUsername());
        //输入的用户名不能为空
        if(user == null)
            return 0;
        if(user1 == null)
            //注册成功为1(userService.addUser(user))
            return userService.addUser(user);
        else
            //输入的用户名已经被注册
            return 2;
    }

}