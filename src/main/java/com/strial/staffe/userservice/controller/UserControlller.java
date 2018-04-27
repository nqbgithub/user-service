package com.strial.staffe.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务控制器
 *
 * @author nanqibao
 */
@RestController
public class UserControlller {
    @Autowired
    private Environment environment;

    @RequestMapping("/sysinfo")
    public String getSysInfo(){
        return "获取系统消息" + environment.getProperty("driver");
    }
}
