package com.atguigu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MyDivision;
import com.atguigu.config.MyConfigOfAspect;

public class Test_aop {
	ApplicationContext context =  new  AnnotationConfigApplicationContext(MyConfigOfAspect.class);
	
	//≤‚ ‘beanπ§≥ß
	@Test
	public void test05() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigOfAspect.class);
		
		MyDivision division = applicationContext.getBean(MyDivision.class);
		division.div(1, 1);
		
		applicationContext.close();
	}
	
}
