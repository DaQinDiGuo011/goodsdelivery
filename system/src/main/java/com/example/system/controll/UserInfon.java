package com.example.system.controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys-user")
public class UserInfon {

    @RequestMapping("login")
    public String login() {
        return "欢迎登陆";
    }
}
