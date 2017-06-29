package com.springmvcdemo.dao;

import com.springmvcdemo.model.User;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:31
 */
public interface UserDao {
    public User findById(String id);

    public void saveUser(String key,User user);
}
