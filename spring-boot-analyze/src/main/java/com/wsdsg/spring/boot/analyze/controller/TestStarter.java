package com.wsdsg.spring.boot.analyze.controller;

import girl.friend.service.GirlFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Author DoubleC
*@Description 测试springBoot启动器
*@Date 2019/12/10 13:54
**/
@RestController
public class TestStarter {


    @Autowired
    private GirlFriendService girlFriendService;

    @RequestMapping("/test")
    public void say(){
        girlFriendService.say();
    }

}
