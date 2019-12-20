package girl.friend.service.impl;

import girl.friend.config.GirlFriendAutoProperties;
import girl.friend.service.GirlFriendService;
import org.springframework.beans.factory.annotation.Autowired;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/10 11:37
**/
public class GirlFriendServiceImpl implements GirlFriendService {

    @Autowired
    private GirlFriendAutoProperties girlFriendAutoProperties;

    @Override
    public void say() {
        System.out.println("I want to say : "+girlFriendAutoProperties.getSomeHeartWord());
    }
}
