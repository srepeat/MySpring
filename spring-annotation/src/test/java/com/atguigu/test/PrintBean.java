package com.atguigu.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MyConfigOfProfile;

public class PrintBean {

	public static void printBean(AnnotationConfigApplicationContext applicationContext) {
		//打印IOC容器中注册了那些组件
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}
	
	public static void printGetBean(AnnotationConfigApplicationContext applicationContext) {
		String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
		for (String dataName : namesForType) {
			System.out.println(dataName);
		}
	}
}
