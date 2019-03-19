package cn.school.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.school.bean.User;
import cn.school.controller.LoginController;

public class UserTest {

	@Test
	public void tets() {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LoginController.class);
		String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
		for (String string : beanNamesForType) {
			System.out.println(string);
		}
	}
	
	
}
