package com.lwk.springboot.mybatisp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwk.springboot.mybatisp.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>  {

    List<User> getUserListLikeName(String nickname);
}
