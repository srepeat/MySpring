package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.BeanConfigLeftCycle;


public class Test_LeftCycle {

	
	@Test
	public void test01() {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext =  new  AnnotationConfigApplicationContext(BeanConfigLeftCycle.class);
		System.out.println("����������ɡ�������");
//		Object bean = applicationContext.getBean(Car.class);
		
		//�ر�bean
		applicationContext.close();
	}
	
	
}
