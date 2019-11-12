package com.jk.user.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 3356559204567260610L;

    private Integer userId;
    private String  userName;
    private String  userPwd;
    private Integer userSex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date    userDate;
    private String  userImg;
    private String  userPhone;
    private String  rname;
    private String  RoleId;
}
