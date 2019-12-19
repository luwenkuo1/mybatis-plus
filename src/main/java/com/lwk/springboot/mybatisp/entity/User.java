package com.lwk.springboot.mybatisp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@TableName("rbac_user")
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String account;

    private String password;

    private Date createdTime;

}



