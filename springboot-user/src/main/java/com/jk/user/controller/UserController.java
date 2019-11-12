package com.jk.user.controller;

import com.jk.user.model.User;
import com.jk.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("queryUser")
    @ResponseBody
    public Map<String ,Object> queryUser(Integer page,Integer rows){

        return userService.queryUser(page,rows);
    }

    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(User user){
        userService.addUser(user);
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(User user,HttpServletRequest request){
        User loginUser = userService.queryUserByName(user.getUserName());

        if(loginUser!=null){
            if(loginUser.getUserPwd().equals(user.getUserPwd())){
                request.getSession().setAttribute("user",loginUser);
                return "success";
            }
                return "pwdError";
        }
        return "userError";
    }
}
