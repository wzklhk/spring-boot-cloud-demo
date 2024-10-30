package com.example.cloud.busi.service;

import com.example.cloud.busi.mapper.UserMapper;
import com.example.cloud.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private UserRepository userRepository;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void insert(User user) {
        userMapper.insertUser(user);
    }

    public User findById(int id) {
        return userMapper.findById(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(int id) {
        userMapper.delete(id);
    }
}
