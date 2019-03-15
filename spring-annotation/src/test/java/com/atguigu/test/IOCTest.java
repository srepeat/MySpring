package com.atguigu.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.atguigu.bean.Person;
import com.atguigu.config.MyConfig;
import com.atguigu.config.PersonConfig;

public class IOCTest {
	ApplicationContext context =  new  AnnotationConfigApplicationContext(MyConfig.class);
	
	@Test
	public void test04() {
		printImport(context);
	}
	
	public void printImport(ApplicationContext context) {
		/*String[] namesForType = context.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		}*/
		
		String[] definitionNames = context.getBeanDefinitionNames();
		for (String dName : definitionNames) {
			System.out.println(dName);
		}
	}
	
	@Test
	public void test03() {
		//可以查看启动加载了那些容器 
		//String[] beanDefinitionNames = context.getBeanDefinitionNames();
		//查看装配了那些bean
		String[] forType = context.getBeanNamesForType(Person.class);
		//显示当前编译的系统环境
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
		for (String name : forType) {
			System.out.println(name);
		}
		
		Map<String, Person> map = context.getBeansOfType(Person.class);
		System.out.println(map);
	}
	
	
	@SuppressWarnings("resource")
	@Test
	public void test02() {
		ApplicationContext context =  new  AnnotationConfigApplicationContext(MyConfig.class);
		//查看扫描到了那些组件
		/*String[] definitionNames = context.getBeanDefinitionNames();
		for (String beanName : definitionNames) {
			System.out.println(beanName);
		}*/
		System.out.println("prototype执行了IOC创建......");
		Person bean1 = (Person) context.getBean("person");
		Person bean2 = (Person) context.getBean("person");
		System.out.println(bean1 == bean2);
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test01() {
		ApplicationContext context =  new  AnnotationConfigApplicationContext(PersonConfig.class);
		//查看扫描到了那些组件
		String[] definitionNames = context.getBeanDefinitionNames();
		for (String beanName : definitionNames) {
			System.out.println(beanName);
		}
	}
}
