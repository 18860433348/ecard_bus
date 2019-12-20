package com.ets.ecard.consumer.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/11/30 10:15
 **/
@Component
@FeignClient("ecard-provider-account")
@RequestMapping("/v1/card")
public interface CustCardClient {

    @RequestMapping(value = "/getOneCard",method = RequestMethod.GET)
    String getOneCard(@RequestParam("id") Integer id);

}
