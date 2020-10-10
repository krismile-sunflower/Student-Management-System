package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserDao {
    int addUser(User user);

    int deleteById(Integer id);

    int updateUser(User user);

    User findUserByName(String name);

    List<User> queryAllUser();
}
