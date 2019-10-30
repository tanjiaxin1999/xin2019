package com.tjx.xinuser.controller;

import com.tjx.xin.bean.UmsMemberReceiveAddress;
import com.tjx.xin.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UmsMemberReceiveAddressController {

    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @GetMapping("/selectIdByUmsMemberReceiveAddress")
    public List<UmsMemberReceiveAddress> selectIdByUmsMemberReceiveAddress(String member_id){
        return umsMemberReceiveAddressService.selectIdByUmsMemberReceiveAddress(member_id);
    }

}
