package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/1/8 10:16
**/
@Controller
public class TestController {

    @RequestMapping("/text")
    @ResponseBody
    public String text(){
        return "hello spring-on-annotation";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("xiaochuan","a boy");
        return map;
    }

}
