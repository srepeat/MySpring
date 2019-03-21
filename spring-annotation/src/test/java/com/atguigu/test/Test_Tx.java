package com.atguigu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.tx.TxConfig;
import com.atguigu.tx.Userservice;

public class Test_Tx {
	ApplicationContext context =  new  AnnotationConfigApplicationContext(TxConfig.class);
	
	@Test
	public void test01() {
		Userservice bean = context.getBean(Userservice.class);
		bean.insert();
	}
}
