package com.ets.ecard.provider.account.controller;

import com.ets.ecard.common.domain.TrCustCard;
import com.ets.ecard.common.util.DateUtil;
import com.ets.ecard.provider.account.service.TrCustCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/11/30 8:35
**/
@RestController
@RequestMapping("/v1/card")
public class CustCardController {

    @Autowired
    TrCustCardService trCustCardService;

    @RequestMapping(value = "/getOneCard",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String getOneCard(Integer id){
        TrCustCard trCustCard = trCustCardService.selectByPrimaryKey(id);
        return trCustCard.toString()+"=======y呀呀呀呀呀=====>"+ DateUtil.date2String(new Date(),DateUtil.PATTERN_STANDARD);
    }

}
