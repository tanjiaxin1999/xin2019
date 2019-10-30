package com.tjx.xinuser.controller;

import com.tjx.xin.bean.UmsMember;
import com.tjx.xin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/selectAllUser")
    public List<UmsMember> selectAllUser(){
        return userService.selectAllUser();
    }

}
