package com.zz.mall.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {

    private Integer id;
    private String name;
    private String mailAddress;
    private String pwd;
    private String phoneNo;
    private Boolean active;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
