package com.atguigu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrintBean {

	public static void printBean(AnnotationConfigApplicationContext applicationContext) {
		//打印IOC容器中注册了那些组件
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}
}
