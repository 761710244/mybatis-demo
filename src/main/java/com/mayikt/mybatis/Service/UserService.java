package com.mayikt.mybatis.Service;

import com.mayikt.mybatis.Mapper.UserMapper;
import com.mayikt.mybatis.Model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
