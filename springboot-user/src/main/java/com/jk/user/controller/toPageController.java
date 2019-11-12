package com.jk.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class toPageController {

    @RequestMapping("toMain")
    public String toMain(){

        return "main";
    }

    @RequestMapping("toUserList")
    public String toUserList(){

        return "user/userList";
    }

    @RequestMapping("toRoleList")
    public String toRoleList(){

        return "role/roleList";
    }

    @RequestMapping("toAddUser")
    public String toAddUser(){

        return "user/addUser";
    }

    @RequestMapping("toLogin")
    public String toLogin(){

        return "login";
    }
}
