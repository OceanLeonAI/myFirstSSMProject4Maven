package com.leon.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.leon.pojo.User;
import com.leon.service.IUserService;

/**
 * 
 * @Description: 测试Spring和MyBatis是否整合成功
 * 
 * @Title: TestMyBatis.java
 * @Package: com.leon
 * @author: OceanLeonAI
 * @date: 2018年5月23日 下午2:54:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	//private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	/*@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (IUserService) ac.getBean("userService");
	}*/

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}

}
