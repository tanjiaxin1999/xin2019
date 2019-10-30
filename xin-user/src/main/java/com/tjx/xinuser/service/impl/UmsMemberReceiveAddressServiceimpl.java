package com.tjx.xinuser.service.impl;

import com.tjx.xin.bean.UmsMemberReceiveAddress;
import com.tjx.xin.service.UmsMemberReceiveAddressService;
import com.tjx.xinuser.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceimpl implements UmsMemberReceiveAddressService {

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> selectIdByUmsMemberReceiveAddress(String mumber_id) {
//        Example example=new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId",mumber_id);
//        return umsMemberReceiveAddressMapper.selectByExample(example);
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(mumber_id);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
