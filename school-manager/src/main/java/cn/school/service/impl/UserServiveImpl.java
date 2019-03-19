package cn.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.school.bean.User;
import cn.school.dao.UserDao;
import cn.school.service.UserService;

@Service
public class UserServiveImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User query4Login(User user) {
		// TODO Auto-generated method stub
		return userDao.query4Login(user);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
	}

	
	
}
