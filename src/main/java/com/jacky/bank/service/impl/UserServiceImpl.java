package com.jacky.bank.service.impl;

import com.jacky.bank.mapper.UserMapper;
import com.jacky.bank.model.Result;
import com.jacky.bank.model.User;
import com.jacky.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(String username, String password) {
        Result<User> result = new Result<>();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.login(username, password);
            if(existUser == null){
                result.setMsg("用户名或密码错误");
            }else{
                result.setMsg("登录成功");
                result.setSuccess(true);
                result.setDetail(existUser);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result register(User user) {
        Result<User> result = new Result<>();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.findUserByName(user.getUserName());
            if(existUser != null){
                //如果用户名已存在
                result.setMsg("用户名已存在");
            }else{
                user.setUserId(UUID.randomUUID().toString());
                user.setMoney(0);
                user.setCreateTime(new Date());
                userMapper.register(user);
                //System.out.println(user.getId());
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result getProfiles(String userId) {
        Result<User> result = new Result<>();
        result.setSuccess(true);
        result.setDetail(userMapper.getProfilesByUserId(userId));
        result.setMsg("获取用户信息成功");
        return result;
    }



}
