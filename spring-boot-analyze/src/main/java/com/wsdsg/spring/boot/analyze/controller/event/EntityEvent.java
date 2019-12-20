package com.wsdsg.spring.boot.analyze.controller.event;

import com.wsdsg.spring.boot.analyze.entity.User;
import org.springframework.context.ApplicationEvent;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/20 17:25
**/
public class EntityEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */

    private User user;

    public EntityEvent(Object source,User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
