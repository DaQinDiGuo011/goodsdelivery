package com.example.system.service.impl;

import com.example.system.dao.UserAddrMapper;
import com.example.system.pojo.UserAddr;
import com.example.system.service.UserAddrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserAddrServiceImpl implements UserAddrService {

    @Resource
    private UserAddrMapper userAddrMapper;

    @Override
    public List<UserAddr> queryUserAddrByUId(String UId) {
        return userAddrMapper.queryUserAddrByUId(UId);
    }
}
