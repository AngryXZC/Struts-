package com.xzc.service;

import com.xzc.dao.UserDao;
import com.xzc.domain.User;

import java.sql.SQLException;

/**
 * @author xzc
 * @date 2024/10/10 15 34:38
 * @description
 */
public class UserSerivce {
    public boolean findUser(User user) throws SQLException {
        UserDao userDao = new UserDao();
        User user1 = userDao.findUser(user);
        return user1 ==null?false:true;
    }
}
