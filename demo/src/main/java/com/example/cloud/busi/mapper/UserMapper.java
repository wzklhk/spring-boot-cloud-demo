package com.example.cloud.busi.mapper;

import com.example.cloud.common.CommonMapper;
import com.example.cloud.pojo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends CommonMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("INSERT INTO user (name, email) VALUES (#{name}, #{email})")
    void insertUser(User user);

    @Select("SELECT * FROM user WHERE id = ${id}")
    User findById(int id);

    @Update("UPDATE user SET name=#{name}, email=#{email} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(int id);
}
