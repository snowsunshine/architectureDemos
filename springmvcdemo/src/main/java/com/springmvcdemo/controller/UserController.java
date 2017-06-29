package com.springmvcdemo.controller;

import com.springmvcdemo.model.User;
import com.springmvcdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with hpay.
 * User: chenxueqing
 * Date: 2017/6/27
 * Time: 16:33
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String ,Object> findById(String id){
        Map<String,Object> jsonMap = new HashMap<String, Object>();
        User user = userService.findById(id);
        jsonMap.put(id,user);
        return jsonMap;
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public Map<String ,Object> saveUser(User user){
        Map<String,Object> jsonMap = new HashMap<String, Object>();
        userService.saveUser(user.getId(),user);
        jsonMap.put(user.getId(),user);
        return jsonMap;
    }

}

