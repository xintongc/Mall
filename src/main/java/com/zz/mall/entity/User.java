package com.zz.mall.entity;

import lombok.Data;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class User {


    private Integer id;
    @NotNull(message = "name不允许为空")
    private String name;
    private String mailAddress;
    private String pwd;
    private String phoneNo;
    private Boolean active;
    private Timestamp createdAt;
    private Timestamp updatedAt;


    @PrePersist
    public void prePersist() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        createdAt=timestamp;
        updatedAt = timestamp;
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }

}
