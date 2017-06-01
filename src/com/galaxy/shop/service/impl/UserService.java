package com.galaxy.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.shop.dao.UserDao;
import com.galaxy.shop.model.entity.User;
import com.galaxy.shop.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	
	@Resource
	private UserDao userDao;

	@Override
	public List<User> getAll() {

		
		List<User> list = this.userDao.list();
		
		
		return list;
	}
	
	
	
	
	
	
}
