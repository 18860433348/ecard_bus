package com.ets.ecard.consumer.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/11/30 10:12
 **/
@Component
@FeignClient("ecard-provider-customer")
@RequestMapping("/v1/cust")
public interface CustomerClient {

    @RequestMapping(value = "/getOneCust",method = RequestMethod.GET)
    String getOneCustomerInfo(@RequestParam("id") Integer id);

}
