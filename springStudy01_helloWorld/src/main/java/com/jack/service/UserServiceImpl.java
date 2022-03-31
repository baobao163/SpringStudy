package com.jack.service;

import com.jack.dao.UserDao;
import com.jack.dao.UserDaoImpl;
import com.jack.dao.UserDaoMySqlImpl;

/**
 * @ClassName UserServiceImpl
 * @Description Jack
 * @Author jack.bao
 * @Date 3/28/2022 4:20 PM
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {
    //    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
