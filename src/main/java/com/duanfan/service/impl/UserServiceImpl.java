package com.duanfan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.duanfan.Dao.UserMapper;
import com.duanfan.entity.User;
import com.duanfan.service.UserService;
/**
 * 用户服务层
 * @author Administrator
 *
 */
@Service 
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userDao;
	
	@Cacheable(value={"user"}, key="#id")
	@Override
	public User getUserByid(int id) {
		return userDao.selectByPrimaryKey(String.valueOf(id));
	}

}
