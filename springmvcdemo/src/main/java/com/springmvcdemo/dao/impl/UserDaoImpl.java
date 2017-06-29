package com.springmvcdemo.dao.impl;

import com.springmvcdemo.dao.UserDao;
import com.springmvcdemo.model.User;
import com.springmvcdemo.util.AbstractBaseRedisTemplete;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:35
 */
public class UserDaoImpl extends AbstractBaseRedisTemplete<User> implements UserDao {
    public User findById(String id) {
        return redisTemplate.opsForValue().get(id);
    }

    public void saveUser(String key, User user) {
         redisTemplate.opsForValue().set(key,user);
    }
}
