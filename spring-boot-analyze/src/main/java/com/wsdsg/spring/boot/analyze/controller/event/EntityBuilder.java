package com.wsdsg.spring.boot.analyze.controller.event;

import com.wsdsg.spring.boot.analyze.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/20 17:23
**/
@Component
public class EntityBuilder {

    @Autowired
    ApplicationEventPublisher publisher;

    @PostConstruct
    public void newEntity(){
        User user = new User();
        user.setName("阿川");
        user.setAge(15);
        EntityEvent entityEvent = new EntityEvent(this, user);
        publisher.publishEvent(entityEvent);
    }

}
