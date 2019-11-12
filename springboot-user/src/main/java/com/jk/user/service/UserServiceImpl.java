package com.jk.user.service;

import com.jk.user.mapper.UserMapper;
import com.jk.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> queryUser(Integer page, Integer rows) {
        int sum = userMapper.querySum();
        int start = (page-1)*rows;
        List<User> userList = userMapper.queryUser(start,rows);
        Map<String,Object> map = new HashMap<String ,Object>();
        map.put("total",sum);
        map.put("rows",userList);

        return map;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);

        String[] split = user.getRoleId().split(",");
        List<User> list = new ArrayList<User>();
        for (String roleIds:split) {
            User u = new User();
            u.setUserId(user.getUserId());
            u.setRoleId(roleIds);
            list.add(u);
        }
        userMapper.addUserRole(list);
    }

    @Override
    public User queryUserByName(String userName) {

        return userMapper.queryUserByName(userName);
    }
}
