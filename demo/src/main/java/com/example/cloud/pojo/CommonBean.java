package com.example.cloud.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CommonBean {
    private Long id;

    private Date createTime;

    private Date updateTime;
}
