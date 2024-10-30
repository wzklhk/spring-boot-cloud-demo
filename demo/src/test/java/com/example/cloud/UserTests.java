package com.example.cloud;

import com.example.cloud.busi.mapper.UserMapper;
import com.example.cloud.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTests {

    @Autowired
    private UserMapper userMapper;

    /*@Autowired
    private UserRepository userRepository;*/

    @Test
    void test() {

    }

    @Test
    void selectAllUserTestMyBatis() {
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }

    /*@Test
    void selectAllUserTestJPA() {
        List<User> users = userRepository.getAll();
        System.out.println(users);
    }*/
}
