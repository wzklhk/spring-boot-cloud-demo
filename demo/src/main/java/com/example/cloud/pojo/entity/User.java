package com.example.cloud.pojo.entity;

import com.example.cloud.pojo.CommonBean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends CommonBean {

    private String name;

    private String email;

}