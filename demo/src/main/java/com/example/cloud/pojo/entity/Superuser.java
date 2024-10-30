package com.example.cloud.pojo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Superuser {
    private Integer id;
    private String ip;
    private String name;
    private String username;
    private String password;
    private String remark;
}
