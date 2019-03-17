package com.atguigu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrintBean {

	public static void printBean(AnnotationConfigApplicationContext applicationContext) {
		//��ӡIOC������ע������Щ���
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}
}
