package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int deleteById(Integer id);

    int updateUser(User user);

    User findUserByName(String name);

    List<User> queryAllUser();
}
