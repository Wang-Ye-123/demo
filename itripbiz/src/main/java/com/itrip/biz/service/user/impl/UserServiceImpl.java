package com.itrip.biz.service.user.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.user.UserService;
import com.itrip.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //dao
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserCode(String userCode, String userPassword) {
        User user = userMapper.getUserByUserCode(userCode);
        if (userPassword.equals(user.getUserPassword())) {
            return user;
        }
        return null;
    }
}
