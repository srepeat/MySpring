package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Userservice {

	@Autowired
	private UserDao userDao;
	
	public void insert() {
		userDao.insert();
		System.out.println("insert÷¥––¡À°£°£°£°£°£°£");
		int x=1/0;
	}
	
	
}
