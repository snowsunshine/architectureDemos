package com.springmvcdemo.service;

import com.springmvcdemo.model.User;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:30
 */
public interface UserService {
    public User findById(String id);
    public void saveUser(String key,User user);
    }
