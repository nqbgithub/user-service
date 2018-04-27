package com.devil.demo.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息控制器
 *
 * @author nanqibao
 */
@Component
@RestController
public class UserController {

    @Autowired
    private Environment environment;

    @RequestMapping("/hello")
    public String getInfo(){
        return "当前使用的数据库驱动是："+ environment.getProperty("driver");
    }
}
