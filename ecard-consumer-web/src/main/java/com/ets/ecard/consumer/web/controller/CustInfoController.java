package com.ets.ecard.consumer.web.controller;

import com.ets.ecard.consumer.web.client.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/11/30 10:17
**/
@RestController
@RequestMapping("/cust")
public class CustInfoController {


    @Autowired
    CustomerClient customerClient;

    @RequestMapping("/getOne")
    public String getOneCust(Integer id){
        String oneCustomerInfo = customerClient.getOneCustomerInfo(id);
        return oneCustomerInfo;
    }

}
