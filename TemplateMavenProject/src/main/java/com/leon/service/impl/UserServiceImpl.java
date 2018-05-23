package com.leon.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leon.dao.IUserDao;
import com.leon.pojo.User;
import com.leon.service.IUserService;

/**
 * 
 * @Description: service接口实现类
 * 
 * @Title: UserServiceImpl.java
 * @Package: com.leon.service.impl
 * @author: OceanLeonAI
 * @date: 2018年5月23日 下午2:47:17
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	/**
	 * 注入dao
	 */
	@Resource
	private IUserDao userDao;

	/**
	 * 根据主键查询用户信息
	 */
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
