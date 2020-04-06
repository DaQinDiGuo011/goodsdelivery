package com.example.system.controll;

import com.example.system.pojo.UserAddr;
import com.example.system.service.UserAddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddrControll {

    @Autowired
    private UserAddrService userAddrService;

    @RequestMapping("/queryUserAddr")
    public List<UserAddr> queryUserAddr(){
        List<UserAddr> userAddrList = userAddrService.queryUserAddrByUId("");
        return userAddrList;
    }
}
