package com.jk.user.mapper;

import com.jk.user.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int querySum();

    List<User> queryUser(@Param("s") int start, @Param("r") Integer rows);

    void addUser(User user);

    void addUserRole(List<User> list);

    User queryUserByName(String userName);
}
