package com.itrip.dao.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserByUserCode(@Param("userCode") String userCode);
}
