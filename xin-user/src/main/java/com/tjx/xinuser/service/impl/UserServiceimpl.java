package com.tjx.xinuser.service.impl;

import com.tjx.xin.bean.UmsMember;
import com.tjx.xin.service.UserService;
import com.tjx.xinuser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> selectAllUser() {
        return userMapper.selectAll();
    }
}
