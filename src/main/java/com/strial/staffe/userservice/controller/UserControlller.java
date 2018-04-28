package com.strial.staffe.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务控制器
 *
 * @author nanqibao
 */
@RestController
public class UserControlller {

    @Value("${driver}")
    private String driver;

    @Value("${name}")
    private String name;

    @RequestMapping("/sms/db_info")
    public String getSysInfo(){
        return "连接数据库的信息："+this.driver+","+this.name;
    }
}
