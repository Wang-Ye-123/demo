package com.itrip.biz.service.user;

import com.itrip.beans.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User getUserByUserCode(String userCode, String userPassword);
}
