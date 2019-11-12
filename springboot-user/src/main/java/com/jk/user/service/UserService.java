package com.jk.user.service;

import com.jk.user.model.User;

import java.util.Map;

public interface UserService {
    Map<String, Object> queryUser(Integer page, Integer rows);

    void addUser(User user);

    User queryUserByName(String userName);
}
