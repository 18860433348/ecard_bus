package com.ets.ecard.provider.customer.controller;

import com.ets.ecard.common.domain.CtCustInfo;
import com.ets.ecard.common.util.DateUtil;
import com.ets.ecard.provider.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/11/29 17:58
**/
@RestController
@RequestMapping("/v1/cust")
public class CtCustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getOneCust",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String getOneCustomerInfo(Integer id){
        Example example = new Example(CtCustInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",id);
        List<CtCustInfo> ctCustInfos = customerService.selectByExample(example);
        return ctCustInfos.toString()+"=====啦啦啦啦=======>"+ DateUtil.date2String(new Date(),DateUtil.PATTERN_STANDARD);
    }

}
