package com.robin.controller;

import com.alibaba.fastjson.JSON;
import com.robin.model.User;
import com.robin.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by dragonfly on 2018/4/7.
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

     @Resource
     private UserService userService;


    @ResponseBody
    @RequestMapping(path = "/getUserById")
    public User getUserById(int userId){

       User user =   userService.getUserById(userId);
       System.out.println(JSON.toJSONString(user));
       return user;
    }
}
