package com.ets.ecard.consumer.web.controller;

import com.ets.ecard.consumer.web.client.CustCardClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/11/30 10:20
**/
@RestController
@RequestMapping("/card")
public class CustCardController {

    @Autowired
    CustCardClient custCardClient;

    @RequestMapping("/getOne")
    public String getOneCard(Integer id){
        String oneCard = custCardClient.getOneCard(id);
        return oneCard;
    }

}
