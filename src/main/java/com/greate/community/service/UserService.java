package com.greate.community.service;

import com.greate.community.dao.UserMapper;
import com.greate.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        //以后再加cache，暂时直接查询数据库
        return userMapper.selectUserById(id);
    }
}
