package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MyPropertyValue;

public class Test_propertyValue {
	
	private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyPropertyValue.class);
	
	@Test
	public void test01() {
		// TODO Auto-generated method stub
		printBean(applicationContext);
		System.out.println("===========================");
		Person bean = (Person) applicationContext.getBean("person");
		System.out.println(bean);
		applicationContext.close();
	}
	
	private void printBean(AnnotationConfigApplicationContext applicationContext) {
		//打印IOC容器中注册了那些组件
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}
}
