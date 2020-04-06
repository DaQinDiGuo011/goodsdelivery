package com.example.system.dao;

import com.example.system.pojo.UserAddr;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAddrMapper {

    List<UserAddr> queryUserAddrByUId(String UId);
}
