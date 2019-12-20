package com.wsdsg.spring.boot.analyze.controller.event;

import com.wsdsg.spring.boot.analyze.entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/20 17:31
**/
@Component
public class OperationEntityListener implements ApplicationListener<EntityEvent> {


    @Override
    public void onApplicationEvent(EntityEvent event) {
        Object source = event.getSource();
        User user = event.getUser();
        System.out.println(user);
        System.out.println(source);

    }
}
