package girl.friend.config;

import girl.friend.service.GirlFriendService;
import girl.friend.service.impl.GirlFriendServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/10 11:39
**/
@Configuration
@ConditionalOnClass(GirlFriendService.class)
@EnableConfigurationProperties(GirlFriendAutoProperties.class)
public class GirlFriendAutoConfigration {

    @Bean
    @ConditionalOnMissingBean
    public GirlFriendService girlFriendService(){
        return new GirlFriendServiceImpl();
    }

}
