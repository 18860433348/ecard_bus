package com.wsdsg.spring.boot.analyze;

import com.wsdsg.spring.boot.analyze.controller.TestMybatis;
import com.wsdsg.spring.boot.analyze.entity.Person;
import girl.friend.service.GirlFriendService;
import girl.friend.service.impl.GirlFriendServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootAnalyzeApplicationTests {

	@Autowired
	GirlFriendService girlFriendService;

	@Autowired
	TestMybatis testMybatis;

	@Test
	public void contextLoads() throws Exception {

	}

}
