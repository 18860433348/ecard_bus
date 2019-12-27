package com.wsdsg.spring.boot.analyze.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/23 9:31
**/
@Controller
@RequestMapping("/test")
public class TestMvc {

    @ResponseBody
    @RequestMapping("/mvc")
    public String testMvc(){
        return "hahahahahha";
    }

}
