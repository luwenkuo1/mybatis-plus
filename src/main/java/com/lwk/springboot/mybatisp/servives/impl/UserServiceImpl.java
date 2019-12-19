package com.lwk.springboot.mybatisp.servives.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk.springboot.mybatisp.entity.User;
import com.lwk.springboot.mybatisp.mapper.UserMapper;
import com.lwk.springboot.mybatisp.servives.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserListLikeName(String nickname) {
        return userMapper.getUserListLikeName(nickname);
    }
}
