package com.example.system.service;

import com.example.system.pojo.UserAddr;

import java.util.List;

public interface UserAddrService {
    List<UserAddr> queryUserAddrByUId(String UId);
}
