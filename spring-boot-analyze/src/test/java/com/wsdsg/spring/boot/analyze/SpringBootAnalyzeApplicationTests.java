package com.wsdsg.spring.boot.analyze;

import com.wsdsg.spring.boot.analyze.controller.TestMybatis;
import girl.friend.service.GirlFriendService;
import girl.friend.service.impl.GirlFriendServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
		testMybatis.run();
		System.out.println(111);
	}

}
