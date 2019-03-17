package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.BeanConfigLeftCycle;


public class Test_LeftCycle {

	
	@Test
	public void test01() {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext =  new  AnnotationConfigApplicationContext(BeanConfigLeftCycle.class);
		System.out.println("容器创建完成。。。。");
//		Object bean = applicationContext.getBean(Car.class);
		
		//关闭bean
		applicationContext.close();
	}
	
	
}
