package com.springmvcdemo.service.impl;

import com.springmvcdemo.dao.UserDao;
import com.springmvcdemo.model.User;
import com.springmvcdemo.service.UserService;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:32
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById(String id) {
        return userDao.findById(id);
    }

    public void saveUser(String key, User user) {
         userDao.saveUser(key,user);
    }
}
