package com.leon.service;

import com.leon.pojo.User;

/**
 * 
 * @Description: 接口
 * 
 * @Title: IUserService.java
 * @Package: com.leon.service
 * @author: OceanLeonAI
 * @date: 2018年5月23日 下午2:46:25
 */
public interface IUserService {
	/**
	 * 根据主键查询用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public User getUserById(int userId);

}
