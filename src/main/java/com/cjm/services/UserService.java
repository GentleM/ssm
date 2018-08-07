package com.cjm.services;


import com.cjm.entity.User;
import com.cjm.mappers.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑处理类。
 *
 * @author rango
 *         2018-06-02 21:02
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取所有用户list.
     *
     * @return List<User>
     */
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    /**
     * 新增用户。
     *
     * @param user 用户实体
     * @return int
     */
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
