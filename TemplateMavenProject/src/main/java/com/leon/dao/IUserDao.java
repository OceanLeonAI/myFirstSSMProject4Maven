package com.leon.dao;

import com.leon.pojo.User;

public interface IUserDao {
	/**
	 * 根据主键查询用户信息
	 * 
	 * @return
	 */
	// public User selectByPrimaryKey(int userId);

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	// User selectByPrimaryKey(Integer id);
	public User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
