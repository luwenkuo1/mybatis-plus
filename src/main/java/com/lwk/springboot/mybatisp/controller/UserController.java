package com.lwk.springboot.mybatisp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.lwk.springboot.mybatisp.entity.User;
import com.lwk.springboot.mybatisp.servives.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Api(description = "用户操作")
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * MyBatis-Plus官网地址
     * https://mp.baomidou.com
     */

    @Autowired
    private IUserService userService;

    @ApiOperation("自定义查询")
    @GetMapping("/getUserListLikeName")
    @ResponseBody
    public List<User> getUserListLikeName(int num, int size, String nickname) {

        PageHelper.startPage(num, size);
        return userService.getUserListLikeName(nickname);
    }

    @ApiOperation("分页查询条件")
    @GetMapping("/getPageParam")
    @ResponseBody
    public List<User> getPageParam(int num, int size, String nickname) {

        PageHelper.startPage(num, size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("nickname", nickname);
        List<User> list = userService.list(queryWrapper);
        return list;
    }

    @ApiOperation("分页查询")
    @GetMapping("/getPage")
    @ResponseBody
    public List<User> getPage(int num, int size) {

        PageHelper.startPage(num, size);
        List<User> list = userService.list();
        return list;
    }

    @ApiOperation("按照id查询")
    @GetMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer userId) {

        User user = userService.getById(userId);
        return user;
    }

    @ApiOperation("保存信息（检测事务是否生效）")
    @GetMapping("/addUser2")
    @ResponseBody
    @Transactional
    public User addUser2(String nickname, String userToken) {
        User user = new User();
        user.setAccount(nickname);
        user.setPassword(userToken);
        user.setCreatedTime(Date.valueOf(LocalDate.now()));
        userService.save(user);

        int i = 3 / 0;

        return user;
    }

    @ApiOperation("保存信息")
    @GetMapping("/addUser")
    @ResponseBody
    public User addUser(String nickname, String userToken) {
        User user = new User();
        user.setAccount(nickname);
        user.setPassword(userToken);
        user.setCreatedTime(Date.valueOf(LocalDate.now()));
        userService.save(user);

        return user;
    }
}


