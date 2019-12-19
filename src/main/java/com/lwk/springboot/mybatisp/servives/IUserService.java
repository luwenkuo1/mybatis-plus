package com.lwk.springboot.mybatisp.servives;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lwk.springboot.mybatisp.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {

    List<User> getUserListLikeName(String nickname);
}
